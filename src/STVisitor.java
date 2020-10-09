import models.ClassDeclaration;
import models.MethodDeclaration;
import models.SymbolTable;
import models.VariableDeclaration;
import java.util.ArrayList;

/**
 * The symbol table visitor to fill the symbol table
 */
public class STVisitor extends MiniJavaGrammarBaseVisitor<Void> {
    SymbolTable symbolTable;

    STVisitor() {
        symbolTable = new SymbolTable();
    }

    /**
     * When starts to enter the program, the extended classes probably are declared later
     * In this case, record all occurred class names in advance to avoid a wrong "undeclared" error
     */
    @Override
    public Void visitProgram(MiniJavaGrammarParser.ProgramContext ctx) {
        // record all declared class names
        ArrayList<String> classNames = new ArrayList<>();
        // record all super class names
        ArrayList<String> superclassNames = new ArrayList<>();

        if(ctx.classdecl().size() > 0){
            for(int i = 0; i < ctx.classdecl().size(); i++){
                classNames.add(ctx.classdecl(i).ID(0).getText());
                // if the current class extends any class, record the super class name
                if(ctx.classdecl(i).ID().size() > 1){
                    superclassNames.add(ctx.classdecl(i).ID(1).getText());
                }
            }

            // check if super class names all declared later
            for(String name: superclassNames){
                if(!classNames.contains(name)){
                    System.out.println("Class " + name + " has not been declared");
                }
            }
        }

        return super.visitProgram(ctx);
    }

    /**
     * Insert the main class
     */
    @Override
    public Void visitMainclass(MiniJavaGrammarParser.MainclassContext ctx) {
        String className = ctx.ID(0).getText();
        symbolTable.insertClass(className, new ClassDeclaration(className));
        return super.visitMainclass(ctx);
    }

    /**
     * Insert declared classes
     */
    @Override
    public Void visitClassdecl(MiniJavaGrammarParser.ClassdeclContext ctx) {
        String className = ctx.ID(0).getText();
        String superclassName = null;

        // if the current class has a super class
        if(ctx.ID().size() > 1){
            superclassName = ctx.ID(1).getText();
        }

        ClassDeclaration newClass = new ClassDeclaration(className);

        if(superclassName != null){
            newClass.setExtendsFrom(superclassName);
        }
        symbolTable.insertClass(className, newClass);

        return super.visitClassdecl(ctx);
    }

    /**
     * Insert a new variable
     */
    @Override
    public Void visitVardecl(MiniJavaGrammarParser.VardeclContext ctx) {
        String varName = ctx.ID().getText();
        String type = ctx.type().getText();
        String prevname = "";

        // if the current variable is declared in a class
        if(ctx.getParent() instanceof MiniJavaGrammarParser.ClassdeclContext){
            // class name
            prevname = ((MiniJavaGrammarParser.ClassdeclContext) ctx.getParent()).ID(0).getText();

            // insert the new VariableDeclaration
            VariableDeclaration variableDeclaration = new VariableDeclaration(varName, type, prevname);
            symbolTable.classData.get(prevname).insertVar(varName, variableDeclaration);
        }
        // if the variable is declared in a method
        else if(ctx.getParent() instanceof MiniJavaGrammarParser.MethoddeclContext){
            // get the method name
            prevname = ((MiniJavaGrammarParser.MethoddeclContext) ctx.getParent()).ID().getText();

            VariableDeclaration variableDeclaration = new VariableDeclaration(varName, type, prevname);
            // get the class name
            MiniJavaGrammarParser.ClassdeclContext ancestorClass = (MiniJavaGrammarParser.ClassdeclContext)(ctx.getParent().getParent());
            String className = ancestorClass.ID(0).getText();

            // insert the new one
            symbolTable.classData.get(className).methodData.get(prevname).insertVar(varName, variableDeclaration);
        }

        return super.visitVardecl(ctx);
    }

    /**
     * Insert a new method
     */
    @Override
    public Void visitMethoddecl(MiniJavaGrammarParser.MethoddeclContext ctx) {
        String methodName = ctx.ID().getText();
        String type = ctx.type().getText();

        // get belonged class name
        MiniJavaGrammarParser.ClassdeclContext parent = (MiniJavaGrammarParser.ClassdeclContext)ctx.getParent();
        String className = parent.ID(0).getText();
        MethodDeclaration newMethod = new MethodDeclaration(methodName, type, className);

        // add to parent class
        ClassDeclaration parentClass = symbolTable.classData.get(className);
        parentClass.insertMethod(methodName, newMethod);

        return super.visitMethoddecl(ctx);
    }

    /**
     * Insert method parameters into a MethodDeclaration
     */
    @Override
    public Void visitFormallist(MiniJavaGrammarParser.FormallistContext ctx) {
        String type = ctx.type().getText();
        String varName = ctx.ID().getText();
        MiniJavaGrammarParser.MethoddeclContext methodCtx = (MiniJavaGrammarParser.MethoddeclContext) ctx.getParent();
        VariableDeclaration variableDeclaration = new VariableDeclaration(varName, type, methodCtx.ID().getText());
        String ancestorClass = getAncestorClass(methodCtx);

        // insert the first
        symbolTable.classData.get(ancestorClass).methodData.get(methodCtx.ID().getText()).insertParam(varName, variableDeclaration);

        return super.visitFormallist(ctx);
    }

    /**
     * Insert method parameters
     */
    @Override
    public Void visitFormalrest(MiniJavaGrammarParser.FormalrestContext ctx) {
        String type = ctx.type().getText();
        String varName = ctx.ID().getText();
        MiniJavaGrammarParser.MethoddeclContext methodCtx = (MiniJavaGrammarParser.MethoddeclContext) ctx.getParent().getParent();
        VariableDeclaration variableDeclaration = new VariableDeclaration(varName, type, methodCtx.ID().getText());
        String ancestorClass = getAncestorClass(methodCtx);

        // insert parameters
        symbolTable.classData.get(ancestorClass).methodData.get(methodCtx.ID().getText()).insertParam(varName, variableDeclaration);
        return super.visitFormalrest(ctx);
    }

    /**
     * get current method's class
     * @param ctx   - the current method ctx
     * @return      - the class name it belongs to
     */
    public String getAncestorClass(MiniJavaGrammarParser.MethoddeclContext ctx){
        MiniJavaGrammarParser.ClassdeclContext ancestor = (MiniJavaGrammarParser.ClassdeclContext) ctx.getParent();
        return ancestor.ID(0).getText();
    }

}
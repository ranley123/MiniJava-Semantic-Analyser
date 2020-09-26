import models.ClassDeclaration;
import models.MethodDeclaration;
import models.SymbolTable;
import models.VariableDeclaration;
import utils.MiniJavaGrammarBaseVisitor;
import utils.MiniJavaGrammarParser;


public class MiniJavaVisitor extends MiniJavaGrammarBaseVisitor<Void> {
    SymbolTable symbolTable = null;

    MiniJavaVisitor() {
        symbolTable = new SymbolTable();
    }

    @Override
    public Void visitProgram(MiniJavaGrammarParser.ProgramContext ctx) {
        System.out.println("visit program");
        symbolTable = new SymbolTable();

        return super.visitProgram(ctx);
    }


    @Override
    public Void visitMainclass(MiniJavaGrammarParser.MainclassContext ctx) {
        System.out.println("visit mainclass");
        String className = ctx.ID(0).getText();
        symbolTable.insertClass(className, new ClassDeclaration(className));
//        symbolTable.listClasses();
        return super.visitMainclass(ctx);
    }

    @Override
    public Void visitClassdecl(MiniJavaGrammarParser.ClassdeclContext ctx) {
        System.out.println("visit class");
        String className = ctx.ID(0).getText();
        String superclassName = null;

        if(ctx.ID().size() > 1){
            superclassName = ctx.ID(1).getText();
        }

        ClassDeclaration newClass = new ClassDeclaration(className);
        if(superclassName != null){
            newClass.setExtendsFrom(superclassName);
        }
        symbolTable.insertClass(className, newClass);
//        symbolTable.listClasses();

        return super.visitClassdecl(ctx);
    }

    @Override
    public Void visitVardecl(MiniJavaGrammarParser.VardeclContext ctx) {
        System.out.println("visit var");
        String varName = ctx.ID().getText();
        String type = ctx.type().getText();
        String prevname = "";

        // try to get prev env name
        try{
            MiniJavaGrammarParser.ClassdeclContext parent = (MiniJavaGrammarParser.ClassdeclContext)ctx.getParent();
            prevname = parent.ID(0).getText();
            VariableDeclaration variableDeclaration = new VariableDeclaration(varName, type, prevname);
            symbolTable.classData.get(prevname).insertVar(varName, variableDeclaration);
        }
        catch (Exception e){
            try{
                MiniJavaGrammarParser.MethoddeclContext parent = (MiniJavaGrammarParser.MethoddeclContext)ctx.getParent();
                prevname = parent.ID().getText();

                VariableDeclaration variableDeclaration = new VariableDeclaration(varName, type, prevname);
                MiniJavaGrammarParser.ClassdeclContext ancestorClass = (MiniJavaGrammarParser.ClassdeclContext)parent.getParent();
                String className = ancestorClass.ID(0).getText();

                symbolTable.classData.get(className).methodData.get(prevname).insertVar(varName, variableDeclaration);
            }
            catch (Exception e2){
                e2.printStackTrace();
            }
        }

        symbolTable.listClassesDetailed();

        return super.visitVardecl(ctx);
    }

    @Override
    public Void visitMethoddecl(MiniJavaGrammarParser.MethoddeclContext ctx) {
        System.out.println("visit method");
        String methodName = ctx.ID().getText();
        String type = ctx.type().getText();
//        System.out.println(type);

        // set belonged class name
        MiniJavaGrammarParser.ClassdeclContext parent = (MiniJavaGrammarParser.ClassdeclContext)ctx.getParent();
        String className = parent.ID(0).getText();
        MethodDeclaration newMethod = new MethodDeclaration(methodName, type, className);

        // add to parent class
        ClassDeclaration parentClass = symbolTable.classData.get(className);
        parentClass.insertMethod(methodName, newMethod);
//        parentClass.listMethods();

        return super.visitMethoddecl(ctx);
    }

    @Override
    public Void visitFormallist(MiniJavaGrammarParser.FormallistContext ctx) {
        System.out.println("visit formallist");


        return super.visitFormallist(ctx);
    }

    @Override
    public Void visitFormalrest(MiniJavaGrammarParser.FormalrestContext ctx) {
        System.out.println("visit formal rest");


        return super.visitFormalrest(ctx);
    }

    @Override
    public Void visitType(MiniJavaGrammarParser.TypeContext ctx) {
        System.out.println("visit type");

        return super.visitType(ctx);
    }

    @Override
    public Void visitStatement(MiniJavaGrammarParser.StatementContext ctx) {
        System.out.println("visit statement");


        return super.visitStatement(ctx);
    }

    @Override
    public Void visitExpr(MiniJavaGrammarParser.ExprContext ctx) {
        System.out.println("visit expression");



        return super.visitExpr(ctx);
    }

    @Override
    public Void visitOp(MiniJavaGrammarParser.OpContext ctx) {
        System.out.println("visit operator");


        return super.visitOp(ctx);
    }

    @Override
    public Void visitExprlist(MiniJavaGrammarParser.ExprlistContext ctx) {
        System.out.println("visit expression list");


        return super.visitExprlist(ctx);
    }

    @Override
    public Void visitExprrest(MiniJavaGrammarParser.ExprrestContext ctx) {
        System.out.println("visit expression rest");


        return super.visitExprrest(ctx);
    }

}
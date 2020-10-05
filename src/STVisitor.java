import models.ClassDeclaration;
import models.MethodDeclaration;
import models.SymbolTable;
import models.VariableDeclaration;

import java.util.ArrayList;


public class STVisitor extends MiniJavaGrammarBaseVisitor<Void> {
    SymbolTable symbolTable;

    STVisitor() {
        symbolTable = new SymbolTable();
    }

    @Override
    public Void visitProgram(MiniJavaGrammarParser.ProgramContext ctx) {
        ArrayList<String> classNames = new ArrayList<>();
        ArrayList<String> superclassNames = new ArrayList<>();

        if(ctx.classdecl().size() > 0){
            for(int i = 0; i < ctx.classdecl().size(); i++){
                classNames.add(ctx.classdecl(i).ID(0).getText());
                if(ctx.classdecl(i).ID().size() > 1){
                    superclassNames.add(ctx.classdecl(i).ID(1).getText());
                }
            }
            for(String name: superclassNames){
                if(!classNames.contains(name)){
                    System.out.println("Class " + name + " has not been declared");
                }
            }
        }

        return super.visitProgram(ctx);
    }

    @Override
    public Void visitMainclass(MiniJavaGrammarParser.MainclassContext ctx) {
//        System.out.println("visit mainclass");
        String className = ctx.ID(0).getText();
        symbolTable.insertClass(className, new ClassDeclaration(className));
//        symbolTable.listClasses();
        return super.visitMainclass(ctx);
    }

    @Override
    public Void visitClassdecl(MiniJavaGrammarParser.ClassdeclContext ctx) {
//        System.out.println("visit class");
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
//        System.out.println(ctx.getText());
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

//        symbolTable.listClassesDetailed();

        return super.visitVardecl(ctx);
    }

    @Override
    public Void visitMethoddecl(MiniJavaGrammarParser.MethoddeclContext ctx) {

//        System.out.println("visit method");
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

    // for method parameters
    @Override
    public Void visitFormallist(MiniJavaGrammarParser.FormallistContext ctx) {
//        System.out.println("visit formallist");
        String type = ctx.type().getText();
        String varName = ctx.ID().getText();
        MiniJavaGrammarParser.MethoddeclContext methodCtx = (MiniJavaGrammarParser.MethoddeclContext) ctx.getParent();
        VariableDeclaration variableDeclaration = new VariableDeclaration(varName, type, methodCtx.ID().getText());
        String ancestorClass = getAncestorClass(methodCtx);

        // insert parameters
        symbolTable.classData.get(ancestorClass).methodData.get(methodCtx.ID().getText()).insertParam(varName, variableDeclaration);

        return super.visitFormallist(ctx);
    }

    @Override
    public Void visitFormalrest(MiniJavaGrammarParser.FormalrestContext ctx) {
//        System.out.println("visit formal rest");
        String type = ctx.type().getText();
        String varName = ctx.ID().getText();
        MiniJavaGrammarParser.MethoddeclContext methodCtx = (MiniJavaGrammarParser.MethoddeclContext) ctx.getParent().getParent();
        VariableDeclaration variableDeclaration = new VariableDeclaration(varName, type, methodCtx.ID().getText());
        String ancestorClass = getAncestorClass(methodCtx);

        // insert parameters
        symbolTable.classData.get(ancestorClass).methodData.get(methodCtx.ID().getText()).insertParam(varName, variableDeclaration);
//        symbolTable.classData.get(ancestorClass).listMethods();
        return super.visitFormalrest(ctx);
    }

    @Override
    public Void visitType(MiniJavaGrammarParser.TypeContext ctx) {
        return super.visitType(ctx);
    }

    public String getAncestorClass(MiniJavaGrammarParser.MethoddeclContext ctx){
        MiniJavaGrammarParser.ClassdeclContext ancestor = (MiniJavaGrammarParser.ClassdeclContext) ctx.getParent();
        return ancestor.ID(0).getText();
    }

}
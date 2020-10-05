import models.ClassDeclaration;
import models.MethodDeclaration;
import models.SymbolTable;
import models.VariableDeclaration;


public class STVisitor extends MiniJavaGrammarBaseVisitor<Void> {
    SymbolTable symbolTable;

    STVisitor() {
        symbolTable = new SymbolTable();
    }

    @Override
    public Void visitProgram(MiniJavaGrammarParser.ProgramContext ctx) {

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
//        System.out.println(ctx.getRuleIndex());
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

//    @Override
//    public Void visitStatement(MiniJavaGrammarParser.StatementContext ctx) {
//        if(ctx.ID() != null){
//            if(!IDExists(ctx)){
//                System.out.println("Not Declared: " + ctx.ID().getText() + " in: " + ctx.getText());
//                System.exit(0);
//            }
//        }
//
//        return super.visitStatement(ctx);
//    }

//    @Override
//    public Void visitExpr(MiniJavaGrammarParser.ExprContext ctx) {
//        if(ctx.ID() != null){
//            if(!IDExists(ctx)){
//                System.out.println("Not Declared: " + ctx.ID().getText() + " in: " + ctx.getText());
//                System.exit(0);
//            }
//        }
//        return super.visitExpr(ctx);
//    }

    @Override
    public Void visitType(MiniJavaGrammarParser.TypeContext ctx) {
        return super.visitType(ctx);
    }

    public String getAncestorClass(MiniJavaGrammarParser.MethoddeclContext ctx){
        MiniJavaGrammarParser.ClassdeclContext ancestor = (MiniJavaGrammarParser.ClassdeclContext) ctx.getParent();
        return ancestor.ID(0).getText();
    }

//    public boolean IDExists(ParserRuleContext ctx){
//        String IDName = "";
//        String methodName = null;
//        String className = null;
//
//        if (ctx instanceof MiniJavaGrammarParser.ExprContext){
//            if(((MiniJavaGrammarParser.ExprContext) ctx).THIS() != null){
//                IDName = "this";
//            }
//            else{
//                IDName = ((MiniJavaGrammarParser.ExprContext) ctx).ID().getText();
//            }
////            System.out.println(IDName);
//        }
//        else if(ctx instanceof MiniJavaGrammarParser.StatementContext){
//            IDName = ((MiniJavaGrammarParser.StatementContext) ctx).ID().getText();
//        }
//
//        while(true){
//            if(ctx instanceof MiniJavaGrammarParser.MethoddeclContext){
//                methodName = ((MiniJavaGrammarParser.MethoddeclContext) ctx).ID().getText();
//            }
//            if(ctx instanceof MiniJavaGrammarParser.ClassdeclContext){
//                className = ((MiniJavaGrammarParser.ClassdeclContext) ctx).ID(0).getText();
//                break;
//            }
//            if(ctx instanceof MiniJavaGrammarParser.MainclassContext){
//                className = ((MiniJavaGrammarParser.MainclassContext) ctx).ID(0).getText();
//                break;
//            }
//            ctx = ctx.getParent();
//        }
////        System.out.println(IDName);
////        symbolTable.listClassesDetailed();
//        // find class var first from varData
//        ClassDeclaration curClass = symbolTable.classData.get(className);
//        MethodDeclaration curMethod = null;
//        if(methodName != null){
//            curMethod = curClass.methodData.get(methodName);
//        }
//        if(curClass.varData.containsKey(IDName)){
//            return true;
//        }
//        else if(curClass.methodData.containsKey(IDName)){
//            return true;
//        }
//        else if(curMethod != null && curMethod.varData.containsKey(IDName)){
//            return true;
//        }
//        else if(symbolTable.classData.containsKey(IDName)){
//            return true;
//        }
//        else if(IDName.compareTo("this") == 0){
//            return true;
//        }
//        return false;
//    }

}
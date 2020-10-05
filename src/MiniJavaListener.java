import models.ClassDeclaration;
import models.SymbolTable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MiniJavaListener extends MiniJavaGrammarBaseListener {


    MiniJavaGrammarParser parser;
    STVisitor scopeChecker = new STVisitor();



    public void printError(String error) {
        System.err.println(error);
        System.exit(-1);
    }


    public MiniJavaListener(MiniJavaGrammarParser parse) {
        this.parser = parser;
    }

    @Override
    public void enterProgram(MiniJavaGrammarParser.ProgramContext ctx) {
        ctx.accept(scopeChecker);

    }


    @Override
    public void exitProgram(MiniJavaGrammarParser.ProgramContext ctx) {
        SymbolTable st = scopeChecker.symbolTable;
        Hashtable<String, ClassDeclaration> classData = st.classData;
        Set<Map.Entry<String, ClassDeclaration>> entrySet = classData.entrySet();
        for(Map.Entry<String, ClassDeclaration> entry: entrySet){
            ClassDeclaration classDeclaration = entry.getValue();
            String className = entry.getKey();

            String superclassName = classDeclaration.extendsFrom;

            if(superclassName.length() > 0){
                // check superclass exists
                if(!classData.containsKey(superclassName)){
                    System.out.println("Class " + superclassName + " has not been declared");
                    System.exit(0);
                }

                // check superclass is not itself
                if(className.compareTo(superclassName) == 0){
                    System.out.println("Class " + className + " cannot inherit itself");
                    System.exit(0);
                }

                // check for circular inheritance

                String grandfather = classData.get(superclassName).extendsFrom;
                if(grandfather.compareTo(className) == 0){
                    System.out.println("Class " + className + " cannot have circular inheritance");
                    System.exit(0);
                }
            }
        }
    }

    @Override
    public void enterMainclass(MiniJavaGrammarParser.MainclassContext ctx) {
//        scopeChecker.visitMainclass(ctx);

    }

    //
    @Override
    public void exitMainclass(MiniJavaGrammarParser.MainclassContext ctx) {
//      //  System.out.println("exitMainClass");

    }

    //
    @Override
    public void enterClassdecl(MiniJavaGrammarParser.ClassdeclContext ctx) {
//        scopeChecker.visitClassdecl(ctx);
//
    }

    //
    @Override
    public void exitClassdecl(MiniJavaGrammarParser.ClassdeclContext ctx) {

    }

    //
    @Override
    public void enterVardecl(MiniJavaGrammarParser.VardeclContext ctx) {
//        scopeChecker.visitVardecl(ctx);

    }

    //
    @Override
    public void exitVardecl(MiniJavaGrammarParser.VardeclContext ctx) {
//        System.out.println("exit var");

    }

    //
    @Override
    public void enterMethoddecl(MiniJavaGrammarParser.MethoddeclContext ctx) {
//        scopeChecker.visitMethoddecl(ctx);
    }

    //
    @Override
    public void exitMethoddecl(MiniJavaGrammarParser.MethoddeclContext ctx) {

    }

    //
    @Override
    public void enterFormallist(MiniJavaGrammarParser.FormallistContext ctx) {
//        scopeChecker.visitFormallist(ctx);
    }

    //
    @Override
    public void exitFormallist(MiniJavaGrammarParser.FormallistContext ctx) {

    }

    //
    @Override
    public void enterFormalrest(MiniJavaGrammarParser.FormalrestContext ctx) {
//        scopeChecker.visitFormalrest(ctx);
    }


    //
    @Override
    public void exitFormalrest(MiniJavaGrammarParser.FormalrestContext ctx) {

    }

    //
    @Override
    public void enterType(MiniJavaGrammarParser.TypeContext ctx) {
//        scopeChecker.visitType(ctx);
    }

    @Override
    public void exitType(MiniJavaGrammarParser.TypeContext ctx) {
        // System.out.println("exitType");
    }
//


    @Override
    public void enterStatement(MiniJavaGrammarParser.StatementContext ctx) {
//        scopeChecker.visitStatement(ctx);
    }


    @Override
    public void exitExpr(MiniJavaGrammarParser.ExprContext ctx) {
        //  System.out.println("exitExpr");
    }

    @Override
    public void enterOp(MiniJavaGrammarParser.OpContext ctx) {
        // System.out.println("enterOp");
    }

    @Override
    public void exitOp(MiniJavaGrammarParser.OpContext ctx) {
        // System.out.println("exitOp");
    }

    @Override
    public void enterExprlist(MiniJavaGrammarParser.ExprlistContext ctx) {
//        scopeChecker.visitExprlist(ctx);
    }

    @Override
    public void exitExprlist(MiniJavaGrammarParser.ExprlistContext ctx) {
        //System.out.println("exitExprList");
    }

    @Override
    public void enterExprrest(MiniJavaGrammarParser.ExprrestContext ctx) {
//        scopeChecker.visitExprrest(ctx);
    }

    @Override
    public void exitExprrest(MiniJavaGrammarParser.ExprrestContext ctx) {
        //System.out.println("exitExprrest");
    }
}



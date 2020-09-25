package utils;

public class MiniJavaVisitor extends MiniJavaGrammarBaseVisitor<Void> {

    MiniJavaVisitor() {
        System.out.println("hello");

    }

    @Override
    public Void visitProgram(MiniJavaGrammarParser.ProgramContext ctx) {
        System.out.println("hello");

        return super.visitProgram(ctx);
    }


    @Override
    public Void visitMainclass(MiniJavaGrammarParser.MainclassContext ctx) {
        System.out.println("hello");

        return super.visitMainclass(ctx);
    }

    @Override
    public Void visitClassdecl(MiniJavaGrammarParser.ClassdeclContext ctx) {
        System.out.println("hello");

        return super.visitClassdecl(ctx);
    }

    @Override
    public Void visitVardecl(MiniJavaGrammarParser.VardeclContext ctx) {
        System.out.println("hello");

        return super.visitVardecl(ctx);
    }

    @Override
    public Void visitMethoddecl(MiniJavaGrammarParser.MethoddeclContext ctx) {
        System.out.println("hello");


        return super.visitMethoddecl(ctx);
    }

    @Override
    public Void visitFormallist(MiniJavaGrammarParser.FormallistContext ctx) {
        System.out.println("hello");


        return super.visitFormallist(ctx);
    }

    @Override
    public Void visitFormalrest(MiniJavaGrammarParser.FormalrestContext ctx) {
        System.out.println("hello");


        return super.visitFormalrest(ctx);
    }

    @Override
    public Void visitType(MiniJavaGrammarParser.TypeContext ctx) {
        System.out.println("hello");

        return super.visitType(ctx);
    }

    @Override
    public Void visitStatement(MiniJavaGrammarParser.StatementContext ctx) {
        System.out.println("hello");


        return super.visitStatement(ctx);
    }

    @Override
    public Void visitExpr(MiniJavaGrammarParser.ExprContext ctx) {
        System.out.println("hello");


        return super.visitExpr(ctx);
    }

    @Override
    public Void visitOp(MiniJavaGrammarParser.OpContext ctx) {
        System.out.println("hello");


        return super.visitOp(ctx);
    }

    @Override
    public Void visitExprlist(MiniJavaGrammarParser.ExprlistContext ctx) {
        System.out.println("hello");


        return super.visitExprlist(ctx);
    }

    @Override
    public Void visitExprrest(MiniJavaGrammarParser.ExprrestContext ctx) {
        System.out.println("hello");


        return super.visitExprrest(ctx);
    }

}
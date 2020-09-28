import models.ClassDeclaration;
import models.MethodDeclaration;
import models.SymbolTable;
import org.antlr.v4.runtime.ParserRuleContext;
import utils.MiniJavaGrammarBaseVisitor;
import utils.MiniJavaGrammarParser;

public class TypeChecker extends MiniJavaGrammarBaseVisitor<Void> {
    SymbolTable symbolTable;

    public TypeChecker(SymbolTable symbolTable){
        this.symbolTable = symbolTable;
    }

    @Override
    public Void visitStatement(MiniJavaGrammarParser.StatementContext ctx) {
        if(ctx.EQUALS() != null && ctx.getChildCount() == 4){
//            System.out.println(ctx.getText());

            String type1 = getIDType(ctx);
//            System.out.println("type 1: " + type1);

            String type2 = getExprType(ctx.expr(0));
//            System.out.println("type 2: " + type2);

            if (type1.compareTo(type2) != 0){
                printTypeError(type1, type2, ctx);
                System.exit(0);
            }
        }
        else if(ctx.EQUALS() != null && ctx.getChildCount() == 7){
            String type1 = getExprType(ctx.expr(0));
            String type2 = getExprType(ctx.expr(1));
            if(type1.compareTo("int") != 0 || type2.compareTo("int") != 0){
                printTypeError(type1, type2, ctx);

                System.exit(0);
            }
        }
        else if (ctx.WHILE() != null || ctx.IF() != null){
            String type = getExprType(ctx.expr(0));
            if(type.compareTo("boolean") == 0){
                printTypeError(type, "while", ctx);
                System.exit(0);
            }
        }

        else if(ctx.SYSTEMOUT() != null){
            String type = getExprType(ctx.expr(0));
            if(!(type.compareTo("int") == 0 || type.compareTo("int[]") == 0 || type.compareTo("boolean") == 0)){
                printTypeError(type, "System.out", ctx);
                System.exit(0);
            }
        }
        return super.visitStatement(ctx);
    }

    @Override
    public Void visitExpr(MiniJavaGrammarParser.ExprContext ctx) {
        String type = getExprType(ctx);
//        System.out.println(type);
        return super.visitExpr(ctx);
    }

    public String getExprType(MiniJavaGrammarParser.ExprContext ctx){
        int exprKind = getExprKind(ctx);
//        System.out.println(exprKind);
        switch (exprKind){
            case 0:{
                String type1 = getExprType(ctx.expr(0));
                String type2 = getExprType(ctx.expr(1));

                if(type1.compareTo(type2) == 0){
                    return type1;
                }
                else{
                    printTypeError(type1, type2, ctx);

                    System.exit(0);
                }
                break;
            }

            case 1:{
                String type1 = getExprType(ctx.expr(0));
                String type2 = getExprType(ctx.expr(1));
                if (type2.compareTo("int") != 0){
                    printTypeError(type1, type2, ctx);

                    System.exit(0);
                }
                if(type1.compareTo("int[]") != 0){
                    printTypeError(type1, type2, ctx);

                    System.exit(0);
                }
                return "int";
            }

            case 2:{
                String type = getExprType(ctx.expr(0));
                if(type.compareTo("int[]") != 0){
                    printTypeError(type, "int[]", ctx);

                    System.exit(0);
                }
                return "int";
            }

            // for calling method. this.computeFac(2) the type should be computeFac()
            case 3: {
                String className = getExprType(ctx.expr(0));
//                String type = getIDType(ctx);
                String methodName = ctx.ID().getText();
//                System.out.println("classname " + className);
//                System.out.println(className);
                String type = symbolTable.classData.get(className).methodData.get(methodName).type;
//                System.out.println(type);
                return type;

            }

            case 4:{
                return "int";
            }

            case 5:{
                return "boolean";
            }

            // global search the ID type
            case 6: {
                return getIDType(ctx);
            }

            // THIS
            case 7: {
                return getIDType(ctx);
            }
            case 8:{
                return "int[]";
            }

            // NEW ID LPAREN RPAREN
            case 9:{
                return getIDType(ctx);
            }
            case 10:{
                String type = getExprType(ctx.expr(0));
                if(type.compareTo("boolean") != 0){
                    printTypeError(type, "boolean", ctx);

                    System.exit(0);
                }
                return "boolean";
            }

            case 11:{
                return getExprType(ctx.expr(0));
            }
        }
        return "not implemented";
    }

    public int getExprKind(MiniJavaGrammarParser.ExprContext ctx){
        int kind = -1;

        if(ctx.getChildCount() == 1){
            if(ctx.INTEGER() != null){
                return 4;
            }
            else if(ctx.TRUE() != null || ctx.FALSE() != null){
                return 5;
            }
            else if(ctx.ID() != null){
                return 6;
            }
            else if(ctx.THIS() != null){
                return 7;
            }
        }
        else if (ctx.op() != null){
            return 0;
        }
        else if(ctx.expr().size() == 2 && ctx.LSQUARE() != null){
            return 1;
        }
        else if(ctx.LENGTH() != null){
            return 2;
        }
        else if(ctx.DOT() != null && ctx.LENGTH() == null){
            return 3;
        }
        else if(ctx.NEW() != null && ctx.INT() != null){
            return 8;
        }
        else if(ctx.NEW() != null && ctx.ID() != null){
            return 9;
        }
        else if(ctx.NOT() != null){
            return 10;
        }
        else if(ctx.LPAREN() != null && ctx.getChildCount() == 3){
            return 11;
        }
        return kind;
    }

    public String getIDType(ParserRuleContext ctx){
        String IDName = "";
        String methodName = null;
        String className = null;

        if (ctx instanceof MiniJavaGrammarParser.ExprContext){
            if(((MiniJavaGrammarParser.ExprContext) ctx).THIS() != null){
                IDName = "this";
            }
            else{
                IDName = ((MiniJavaGrammarParser.ExprContext) ctx).ID().getText();
            }
//            System.out.println(IDName);
        }
        else if(ctx instanceof MiniJavaGrammarParser.StatementContext){
            IDName = ((MiniJavaGrammarParser.StatementContext) ctx).ID().getText();
        }

        while(true){
            if(ctx instanceof MiniJavaGrammarParser.MethoddeclContext){
                methodName = ((MiniJavaGrammarParser.MethoddeclContext) ctx).ID().getText();
            }
            if(ctx instanceof MiniJavaGrammarParser.ClassdeclContext){
                className = ((MiniJavaGrammarParser.ClassdeclContext) ctx).ID(0).getText();
                break;
            }
            if(ctx instanceof MiniJavaGrammarParser.MainclassContext){
                className = ((MiniJavaGrammarParser.MainclassContext) ctx).ID(0).getText();
                break;
            }
            if(ctx instanceof MiniJavaGrammarParser.ProgramContext){
                return "string";
            }
            ctx = ctx.getParent();
        }
//        System.out.println(IDName);
//        symbolTable.listClassesDetailed();
        // find class var first from varData
        ClassDeclaration curClass = symbolTable.classData.get(className);
        MethodDeclaration curMethod = null;
        if(methodName != null){
            curMethod = curClass.methodData.get(methodName);
        }
        if(curClass.varData.containsKey(IDName)){
            return curClass.varData.get(IDName).type;
        }
        else if(curClass.methodData.containsKey(IDName)){
            return curClass.methodData.get(IDName).type;
        }
        else if(curMethod != null && curMethod.varData.containsKey(IDName)){
            return curMethod.varData.get(IDName).type;
        }
        else if(symbolTable.classData.containsKey(IDName)){
            return IDName;
        }
        else if(IDName.compareTo("this") == 0){
            return className;
        }
        System.out.println("not declared: " + IDName);
        return "string";
    }

    public void printTypeError(String type1, String type2, ParserRuleContext ctx){
        if(ctx instanceof MiniJavaGrammarParser.StatementContext){
            MiniJavaGrammarParser.StatementContext curCtx = (MiniJavaGrammarParser.StatementContext) ctx;
            System.out.println("Type Error: " + type1 + " and " + type2 + " not matched in " + curCtx.getText());
        }
        else if(ctx instanceof MiniJavaGrammarParser.ExprContext){
            MiniJavaGrammarParser.ExprContext curCtx = (MiniJavaGrammarParser.ExprContext) ctx;
            System.out.println("Type Error: " + type1 + " and " + type2 + " not matched in " + curCtx.getText());

        }

    }

}



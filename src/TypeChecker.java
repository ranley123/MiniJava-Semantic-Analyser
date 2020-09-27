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
            String type1 = getIDType(ctx);
            String type2 = getExprType(ctx.expr(0));
            if (type1.compareTo(type2) != 0){
                System.out.println("Error: Type not matched");
                System.exit(0);
            }
        }
        else if(ctx.EQUALS() != null && ctx.getChildCount() == 7){

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
        switch (exprKind){
            case 0:{
                String type1 = getExprType(ctx.expr(0));
                String type2 = getExprType(ctx.expr(1));

                if(type1.compareTo(type2) == 0){
                    return type1;
                }
                else{
                    System.out.println("Error: Type not matched");
                    System.exit(0);
                }
                break;
            }

            case 1:{
                String type1 = getExprType(ctx.expr(0));
                String type2 = getExprType(ctx.expr(1));
                if (type2.compareTo("int") != 0){
                    System.out.println("Error: Type not matched");
                    System.exit(0);
                }
                if(type1.compareTo("int[]") != 0){
                    System.out.println("Error: Type not matched");
                    System.exit(0);
                }
                return "int";
            }

            case 2:{
                String type = getExprType(ctx.expr(0));
                if(type.compareTo("int[]") != 0){
                    System.out.println("Error: Type not matched");
                    System.exit(0);
                }
                return "int";
            }

            // for calling method. this.computeFac(2) the type should be computeFac()
            case 3: {
                return getIDType(ctx);

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

            // this
            case 7: {
                break;
            }
            case 8:{
                return "int[]";
            }
            case 9:{
                return getIDType(ctx);
            }
            case 10:{
                String type = getExprType(ctx.expr(0));
                if(type.compareTo("boolean") != 0){
                    System.out.println("Error: Type not matched");
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
            IDName = ((MiniJavaGrammarParser.ExprContext) ctx).ID().getText();
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
            if(ctx instanceof MiniJavaGrammarParser.ProgramContext){
                return "string";
            }
            ctx = ctx.getParent();
        }

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
        return "not declared";

    }

}



import models.ClassDeclaration;
import models.MethodDeclaration;
import models.SymbolTable;
import org.antlr.v4.runtime.ParserRuleContext;
import java.util.ArrayList;

public class TypeChecker extends MiniJavaGrammarBaseVisitor<Void> {
    SymbolTable symbolTable;
    private final String INT = "int";
    private final String FLOAT = "float";
    private final String INTARRAY = "int[]";
    private final String BOOLEAN = "boolean";

    public TypeChecker(SymbolTable symbolTable){
        this.symbolTable = symbolTable;
    }

    @Override
    public Void visitStatement(MiniJavaGrammarParser.StatementContext ctx) {
        if(ctx.EQUALS() != null && ctx.getChildCount() == 4){
            String type1 = getIDType(ctx);
            String type2 = getExprType(ctx.expr(0));

            if (!(type1.compareTo(type2) == 0 || (type2.compareTo(BOOLEAN) == 0 && type1.compareTo(INT) == 0) || (type1.compareTo(BOOLEAN) == 0 && type2.compareTo(INT) == 0))){
                if(!isTypeMatched(type1, type2)){
                    printTypeError(type1, type2, ctx.getText());
                }
            }
        }
        else if(ctx.EQUALS() != null && ctx.getChildCount() == 7){
            String type1 = getExprType(ctx.expr(0));
            String type2 = getExprType(ctx.expr(1));

            if(type1.compareTo(INT) != 0){
                printTypeError(type1, INT, ctx.getText());
            }
            else{
                String destType = getIDType(ctx);
                destType = destType.substring(0, destType.length() - 2);
                if(type2.compareTo(destType) != 0){
                    if(!isTypeMatched(destType, type2)){
                        printTypeError(destType, type2, ctx.getText());
                    }
                }
            }


        }
        else if (ctx.WHILE() != null || ctx.IF() != null){
            String type = getExprType(ctx.expr(0));
            if(type.compareTo(BOOLEAN) != 0 && type.compareTo(INT) != 0){
                printTypeError(type, "while", ctx.getText());
//                System.exit(0);
            }
        }

        else if(ctx.SYSTEMOUT() != null){
            String type = getExprType(ctx.expr(0));
            if(!(type.compareTo(INT) == 0 || type.compareTo(INTARRAY) == 0 || type.compareTo(BOOLEAN) == 0)){
                printTypeError(type, "System.out", ctx.getText());
//                System.exit(0);
            }
        }
        return super.visitStatement(ctx);
    }

    @Override
    public Void visitVardecl(MiniJavaGrammarParser.VardeclContext ctx) {
        // when use class as a type
        if(ctx.type().ID() != null){
            String className = ctx.type().ID().getText();
            if(!symbolTable.classData.containsKey(className)){
                System.out.println("Type Error: " + className + " not declared");
//                System.exit(0);
            }
        }
        return super.visitVardecl(ctx);
    }

    @Override
    public Void visitMethoddecl(MiniJavaGrammarParser.MethoddeclContext ctx) {
        // when use class as a type
        if(ctx.type().ID() != null){
            String className = ctx.type().ID().getText();
            if(!symbolTable.classData.containsKey(className)){
                System.out.println("Type Error: " + className + " not declared");
//                System.exit(0);
            }
        }

        // check return type
        String type = ctx.type().getText();
        String returnType = getExprType(ctx.expr());

        if(type.compareTo(returnType) != 0){
            System.out.println("Type Error: " + type + " and " + returnType + " not matched in " + ctx.getText());
        }

        return super.visitMethoddecl(ctx);
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
                    printTypeError(type1, type2, ctx.getText());

//                    System.exit(0);
                }
                break;
            }

            case 1:{
                String type1 = getExprType(ctx.expr(0));
                String type2 = getExprType(ctx.expr(1));
                if (type2.compareTo(INT) != 0){
                    printTypeError(type1, type2, ctx.getText());

//                    System.exit(0);
                }
                if(type1.compareTo(INTARRAY) != 0){
                    printTypeError(type1, type2, ctx.getText());

//                    System.exit(0);
                }
                return INT;
            }

            case 2:{
                String type = getExprType(ctx.expr(0));
                if(type.compareTo(INTARRAY) != 0){
                    printTypeError(type, INTARRAY, ctx.getText());

//                    System.exit(0);
                }
                return INT;
            }

            // expr DOT ID LPAREN exprlist? RPAREN
            // for calling method. this.computeFac(2) the type should be computeFac()
            case 3: {
                String className = getExprType(ctx.expr(0));
                String methodName = ctx.ID().getText();
                if(!symbolTable.classData.containsKey(className) || !symbolTable.classData.get(className).methodData.containsKey(methodName)){
                    System.out.println("Method " + methodName + " in Class " + className + " not declared");
                    System.exit(0);
                }
                checkParameters(symbolTable.classData.get(className).methodData.get(methodName), ctx);
                String type = symbolTable.classData.get(className).methodData.get(methodName).type;
                return type;

            }

            case 4:{
                return INT;
            }

            case 5:{
                return BOOLEAN;
            }

            // global search the ID type
            case 6:

                // NEW ID LPAREN RPAREN
            case 9:

                // THIS
            case 7: {
                return getIDType(ctx);
            }
            // new int[]
            case 8:{
                return INTARRAY;
            }

            // NOT
            case 10:{
                String type = getExprType(ctx.expr(0));
                if(type.compareTo(BOOLEAN) != 0 && type.compareTo(INT) != 0){
                    printTypeError(type, BOOLEAN, ctx.getText());

//                    System.exit(0);
                }
                return BOOLEAN;
            }

            case 11:{
                return getExprType(ctx.expr(0));
            }

            case 12:{
                return FLOAT;
            }

            case 13:{
                return ctx.ID().getText() + "[]";
            }

        }
        return "null";
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
            else if(ctx.FLOATNUM() != null){
                return 12;
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
        else if(ctx.NEW() != null && ctx.ID() != null && ctx.LPAREN() != null){
            return 9;
        }
        else if(ctx.NOT() != null){
            return 10;
        }
        else if(ctx.LPAREN() != null && ctx.getChildCount() == 3){
            return 11;
        }
        else if(ctx.NEW() != null && ctx.ID() != null && ctx.LSQUARE()!= null){
            return 13;
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
        else if(symbolTable.classData.get(curClass.extendsFrom).hasVar(IDName)){
            return symbolTable.classData.get(curClass.extendsFrom).varData.get(IDName).type;
        }
        else if(symbolTable.classData.get(curClass.extendsFrom).hasMethod(IDName)){
            return symbolTable.classData.get(curClass.extendsFrom).methodData.get(IDName).type;
        }
        System.out.println("not declared: " + IDName);
        return "string";
    }

    public void checkParameters(MethodDeclaration method, MiniJavaGrammarParser.ExprContext ctx){
        ArrayList<String> types = new ArrayList<>(); // given types
        int size = 0;

        if(ctx.exprlist() == null){
            size = 0;
        }
        else{
            MiniJavaGrammarParser.ExprlistContext list = ctx.exprlist();
            types.add(getExprType(list.expr()));

            if(list.exprrest() != null){
                for(int i = 0; i < list.exprrest().size(); i++){
                    types.add(getExprType(list.exprrest(i).expr()));
                }
            }
        }
        size = types.size();

        // check size
        if(method.paramData.size() != size){
            System.out.println("Type Error: " + ctx.getText() + " " + method.methodName + " expected " + method.paramData.size() + " parameters, but only " + size + " given");
            return;
        }

        // check type
        if(method.paramData.size() != 0){
            int i = 0;
            for(String destType: method.paramTypes){
                String srcType = types.get(i);

                if(destType.compareTo(srcType) != 0){
                    if(!isTypeMatched(destType, srcType)){
                        printTypeError(destType, srcType, ctx.getText());
                    }
                }
                i++;
            }
        }

    }

    public void printTypeError(String type1, String type2, String text){
        System.out.println("Type Error: " + type1 + " and " + type2 + " not matched in " + text);

    }

    public boolean isPrimitiveType(String type){
        return type.compareTo(INT) == 0 || type.compareTo(INTARRAY) == 0 || type.compareTo(FLOAT) == 0 || type.compareTo(BOOLEAN) == 0;
    }

    public ArrayList<String> getSuperclassType(String type){
        // now the type is the class name
        String superName = symbolTable.classData.get(type).extendsFrom;
        ArrayList<String> types = new ArrayList<>();
        types.add(superName);
        return types;
    }

    public boolean isTypeMatched(String type1, String type2){
        if(isPrimitiveType(type1) || isPrimitiveType(type2)){
            return false;
        }
        else{
            ArrayList<String> types = getSuperclassType(type2);

            for(String type: types){
                if(type.compareTo(type1) == 0){
                    return true;
                }
            }
            return false;
        }
    }


}



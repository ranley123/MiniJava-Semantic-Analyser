import models.SymbolTable;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import utils.MiniJavaGrammarLexer;
import utils.MiniJavaGrammarParser;

import java.io.FileInputStream;
import java.io.InputStream;

public class MiniJavaMain {

    public static void main(String[] args) throws Exception {

        String inputFile = null;

        if (args.length > 0 )
            inputFile = args[0];

        InputStream is = System.in;

        if (inputFile != null ) is = new FileInputStream(inputFile);

        ANTLRInputStream input = new ANTLRInputStream(is);

        MiniJavaGrammarLexer lexer = new MiniJavaGrammarLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        MiniJavaGrammarParser parser = new MiniJavaGrammarParser(tokens);

        ParseTree tree = parser.program();

        ParseTreeWalker walker = new ParseTreeWalker();

        STVisitor visitor = new STVisitor();
        tree.accept(visitor);

        TypeChecker checker = new TypeChecker(visitor.symbolTable);

        MiniJavaListener typecheck = new MiniJavaListener(parser);

//        walker.walk(typecheck, tree);tree
        tree.accept(checker);

    }

    public static void fillSymbable(){

    }


}
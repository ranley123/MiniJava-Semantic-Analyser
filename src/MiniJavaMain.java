import models.SymbolTable;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

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

        MiniJavaListener scopeListener = new MiniJavaListener(parser);

        walker.walk(scopeListener, tree);

        TypeChecker typeChecker = new TypeChecker(scopeListener.scopeChecker.symbolTable);

        tree.accept(typeChecker);

    }

    public static void fillSymbable(){

    }


}
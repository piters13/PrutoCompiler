import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("test"));

            prutoLexer lexer = new prutoLexer(input);
            prutoParser parser = new prutoParser(new CommonTokenStream(lexer));
            parser.addParseListener(new MyPrutoListener());

            // Start parsing
            parser.program();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package Lislitica.runner;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;

import Lislitica.antlr.LaLexer;
import Lislitica.antlr.LaParser;
import Lislitica.antlr.LaVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


public class Main {
    public static void main(String[] args) throws Exception {
        String Test = "data"; //"condition";
        CharStream input = CharStreams.fromFileName("test/" + Test + ".la");
        File output = new File("test/" + Test + ".m");

        LaLexer lexer = new LaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LaParser parser = new LaParser(tokens);
        LaVisitor translator = new Translator();
        String MExpression = String.format("%s", translator.visit(parser.program()));
        System.out.print("========================================\n" + MExpression);

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(output));
            out.write(MExpression);
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

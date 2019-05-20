package Lislitica.runner;

import Lislitica.antlr.LaBaseVisitor;
import Lislitica.antlr.LaParser;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Translator extends LaBaseVisitor<String> {
    public String visitProgram(LaParser.ProgramContext ctx) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < ctx.getChildCount(); i++) {
            //System.out.print("Statement: " + ctx.statement(i - 1).getText() + "\n");
            result.append(this.visit(ctx.statement(i - 1))).append('\n');
        }
        return result.toString();
    }

    public String visitStatement(LaParser.StatementContext ctx) {
        //System.out.print("Statement: " + ctx.getText() + "\n");
        if (ctx.eos() != null) {
            return this.visit(ctx.getChild(0)) + ";";
        } else {
            return this.visit(ctx.getChild(0));
        }
    }

    /* Data Types*/
    public String visitLiteralStatement(LaParser.LiteralStatementContext ctx) {
        //System.out.print("Literal: " + ctx.getText() + "\n");
        return ctx.getText();
    }

    // List
    public String visitLiteralList(LaParser.LiteralListContext ctx) {
        // System.out.print("Data: " + ctx.getText() + "\n");
        Stream<String> terms = ctx.element().stream().map(this::visit);
        int length = ctx.getText().length();
        if (length > 120) {
            String result = terms.collect(Collectors.joining(",\n"));
            return "{\n" + result.replaceAll("(?m)^", "\t") + "\n}";
        } else {
            return "{" + terms.collect(Collectors.joining(", ")) + "}";
        }
    }

    public String visitEmptyList(LaParser.EmptyListContext ctx) {
        //System.out.print("Data: " + ctx.getText() + "\n");
        return "[ ]";
    }

    // Dict
    public String visitLiteralDict(LaParser.LiteralDictContext ctx) {
        //System.out.print("Data: " + ctx.getText() + "\n");
        Stream<String> terms = ctx.keyValue().stream().map(this::visit);
        int length = ctx.getText().length();
        if (length > 120) {
            String result = terms.map(i -> "\t" + i + ",").collect(Collectors.joining("\n"));
            return "<|\n" + result.substring(0, result.length() - 1) + "\n|>";
        } else {
            return "<|" + terms.collect(Collectors.joining(", ")) + "|>";
        }
    }

    public String visitEmptyDict(LaParser.EmptyDictContext ctx) {
        //System.out.print("Data: " + ctx.getText() + "\n");
        return "<| |>";
    }

    public String visitSymbolKey(LaParser.SymbolKeyContext ctx) {
        String k = ctx.key.getText();
        String v = this.visit(ctx.value);
        //System.out.print("Key: " + ctx.getText() + "\n");
        if (ctx.Power() != null) {
            return String.format("%s -> %s", k, v);
        } else {
            return String.format("\"%s\" -> %s", k, v);
        }
    }
}
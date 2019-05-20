package Lislitica.runner;
import Lislitica.antlr.LaBaseVisitor;
import Lislitica.antlr.LaParser;

public class Translator extends LaBaseVisitor<String> {
    public String visitProgram(LaParser.ProgramContext ctx) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < ctx.getChildCount(); i++) {
            System.out.print("Statement: " + ctx.statement(i-1).getText() + "\n");
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



}
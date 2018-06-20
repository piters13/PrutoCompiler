import util.Checker;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyPrutoListener extends prutoBaseListener {
    private Map<String, Object> variables;

    public MyPrutoListener() {
        variables = new HashMap<>();
    }

    @Override
    public void exitAssign(prutoParser.AssignContext ctx) {
        // This method is called when the parser has finished
        // parsing the assign statement

        // Get variable name
        String variableName = ctx.ID(0).getText();

        // Get value from variable or number
        String value = ctx.ID().size() > 1 ? ctx.ID(1).getText() : ctx.NUMBER().getText();

        // Add variable to map
        if(ctx.ID().size() > 1)
            variables.put(variableName, variables.get(value));
        else if(Checker.isInteger(value))
            variables.put(variableName, Integer.parseInt(value));
        else if(Checker.isDouble(value))
            variables.put(variableName, Double.parseDouble(value));




    }

    @Override
    public void exitAssignWithoutValue(prutoParser.AssignWithoutValueContext ctx){
        String variableName = ctx.ID().getText();
        variables.put(variableName, new Object());
    }

    @Override
    public void exitRead(prutoParser.ReadContext ctx){
        String variableName = ctx.ID().getText();
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        if(Checker.isInteger(value)){
            variables.put(variableName, Integer.parseInt(value));
        } else {
            variables.put(variableName, Double.parseDouble(value));
        }
    }

    @Override
    public void exitAdd(prutoParser.AddContext ctx) {
        // This method is called when the parser has finished
        // parsing the add statement

        String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText() : ctx.ID(0).getText();
        Object value;
        if(Checker.isInteger(ctx.NUMBER().getText())){
            value = Integer.parseInt(ctx.NUMBER().getText());
            if(Checker.isInteger(String.valueOf(variables.get(variableName)))) {
                variables.put(variableName, (Integer) variables.get(variableName) + (Integer) value);
            } else {
                variables.put(variableName, (Double)variables.get(variableName) + (Integer)value);
            }
        } else {
            value = Double.parseDouble(ctx.NUMBER().getText());
            if(Checker.isInteger(String.valueOf(variables.get(variableName)))) {
                variables.put(variableName, (Integer) variables.get(variableName) + ((Double)value).intValue());
            } else{
                variables.put(variableName, (Double)variables.get(variableName) + (Double)value);
            }
        }

    }

    @Override
    public void exitSub(prutoParser.SubContext ctx){
        String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText() : ctx.ID(0).getText();

        Object value;
        if(Checker.isInteger(ctx.NUMBER().getText())){
            value = Integer.parseInt(ctx.NUMBER().getText());
            if(Checker.isInteger(String.valueOf(variables.get(variableName)))) {
                variables.put(variableName, (Integer) variables.get(variableName) - (Integer) value);
            } else {
                variables.put(variableName, (Double)variables.get(variableName) - (Integer)value);
            }
        } else {
            value = Double.parseDouble(ctx.NUMBER().getText());
            if(Checker.isInteger(String.valueOf(variables.get(variableName)))) {
                variables.put(variableName, (Integer) variables.get(variableName) - ((Double)value).intValue());
            } else{
                variables.put(variableName, (Double)variables.get(variableName) - (Double)value);
            }
        }
    }

    @Override
    public void exitMultiply(prutoParser.MultiplyContext ctx){
        String variableName = ctx.ID().size() > 1 ? ctx.ID(0).getText() : ctx.ID(0).getText();

        Object value;
        if(Checker.isInteger(ctx.NUMBER().getText())){
            value = Integer.parseInt(ctx.NUMBER().getText());
            if(Checker.isInteger(String.valueOf(variables.get(variableName)))) {
                variables.put(variableName, (Integer) variables.get(variableName) * (Integer) value);
            } else {
                variables.put(variableName, (Double)variables.get(variableName) * (Integer)value);
            }
        } else {
            value = Double.parseDouble(ctx.NUMBER().getText());
            if(Checker.isInteger(String.valueOf(variables.get(variableName)))) {
                variables.put(variableName, (Integer) variables.get(variableName) * ((Double)value).intValue());
            } else{
                variables.put(variableName, (Double)variables.get(variableName) * (Double)value);
            }
        }
    }

    @Override
    public void exitDevide(prutoParser.DevideContext ctx){
        String variableName = ctx.ID().size() > 1 ? ctx.ID(0).getText() : ctx.ID(0).getText();

        Object value;
        if(Checker.isInteger(ctx.NUMBER().getText())){
            value = Integer.parseInt(ctx.NUMBER().getText());
            if(Checker.isInteger(String.valueOf(variables.get(variableName)))) {
                variables.put(variableName, (Integer) variables.get(variableName) / (Integer) value);
            } else {
                variables.put(variableName, (Double)variables.get(variableName) / (Integer)value);
            }
        } else {
            value = Double.parseDouble(ctx.NUMBER().getText());
            if(Checker.isInteger(String.valueOf(variables.get(variableName)))) {
                variables.put(variableName, (Integer) variables.get(variableName) / ((Double)value).intValue());
            } else{
                variables.put(variableName, (Double)variables.get(variableName) / (Double)value);
            }
        }
    }

    @Override
    public void exitPow(prutoParser.PowContext ctx){
        String variableName = ctx.ID().size() > 1 ? ctx.ID(0).getText() : ctx.ID(0).getText();

        Object value;
        if(Checker.isInteger(ctx.NUMBER().getText())){
            value = Integer.parseInt(ctx.NUMBER().getText());
            value = Integer.parseInt(ctx.NUMBER().getText());
            if(Checker.isInteger(String.valueOf(variables.get(variableName)))) {
                variables.put(variableName, (int)Math.pow((Integer)variables.get(variableName), (Integer)value));
            } else {
                variables.put(variableName, Math.pow(((Double)variables.get(variableName)).intValue(), (Integer)value));
            }

        } else {
            value = Double.parseDouble(ctx.NUMBER().getText());

            variables.put(variableName, Math.pow((Double)variables.get(variableName), (Double)value));
        }

    }

    @Override
    public void exitPrint(prutoParser.PrintContext ctx) {
        // This method is called when the parser has finished
        // parsing the print statement

        String output = "";
        if(ctx.ID() == null){
            if(ctx.NUMBER() != null){
                output = ctx.NUMBER().getText();
            }
            else if(ctx.STRING() != null){
                output = ctx.STRING().getText().replaceAll("\"","");
            }

        } else {
            output = variables.get(ctx.ID().getText()).toString();
        }
        System.out.println(output);
    }
}

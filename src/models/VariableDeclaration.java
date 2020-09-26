package models;

public class VariableDeclaration {
    public String varName;
    public String type;
    public String prevName;

    public VariableDeclaration(String varName, String type, String prevName){
        this.varName = varName;
        this.type = type;
        this.prevName = prevName;
    }
}

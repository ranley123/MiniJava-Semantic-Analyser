package models;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MethodDeclaration {
    public String methodName = "";
    public String type;
    public String className;
    public Hashtable<String, VariableDeclaration> paramData;
    public Hashtable<String, VariableDeclaration> varData;

    public MethodDeclaration(String methodName, String type, String className){
        this.methodName = methodName;
        this.type = type;
        this.className = className;
        paramData = new Hashtable<String, VariableDeclaration>();
        varData = new Hashtable<String, VariableDeclaration>();
    }

    public void setClassName(String className){
        this.className = className;
    }

    public void insertParam(String paramName, String type){
        if(paramData.containsKey(paramName)){
            System.out.println("Multiple declarations of parameter " + paramName + " in method " + methodName);
            System.exit(0);
        }
        paramData.put(paramName, new VariableDeclaration(paramName, type));
    }

    public void insertVar(String varName, String type){
        if(varData.containsKey(varName)){
            System.out.println("Multiple declarations of variable " + varName + " in method " + methodName);
            System.exit(0);
        }
        varData.put(varName, new VariableDeclaration(varName, type));
    }

    public void listVars(){
        System.out.println("Method " + this.methodName + " contains variables: ");
        Set<Map.Entry<String, VariableDeclaration>> entrySet = varData.entrySet();
        for (Map.Entry<String, VariableDeclaration> entry: entrySet){
            System.out.println(entry.getKey() + ": " + entry.getValue().type);
        }
    }

    public void listParams(){
        System.out.println("Method " + this.methodName + " contains parameters: ");
        Set<Map.Entry<String, VariableDeclaration>> entrySet = paramData.entrySet();
        for (Map.Entry<String, VariableDeclaration> entry: entrySet){
            System.out.println(entry.getKey() + ": " + entry.getValue().type);
        }
    }
}

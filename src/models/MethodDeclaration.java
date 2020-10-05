package models;

import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MethodDeclaration {
    public String methodName = "";
    public String type = "";
    public String className;
    public Hashtable<String, VariableDeclaration> varData;
    public Hashtable<String, VariableDeclaration> paramData;
    public ArrayList<String> paramTypes;

    public MethodDeclaration(String methodName, String type, String className){
        this.methodName = methodName;
        this.type = type;
        this.className = className;
        varData = new Hashtable<String, VariableDeclaration>();
        paramData = new Hashtable<String, VariableDeclaration>();
        paramTypes = new ArrayList<>();
    }

    public void setClassName(String className){
        this.className = className;
    }

    public void insertVar(String varName, VariableDeclaration variableDeclaration){
        if(varData.containsKey(varName)){
            System.out.println("Multiple declarations of variable " + varName + " in method " + methodName);
            System.exit(0);
        }
        varData.put(varName,variableDeclaration);
    }

    public void insertParam(String paramName, VariableDeclaration variableDeclaration){
        if(varData.containsKey(paramName)){
            System.out.println("Multiple declarations of variable " + paramName + " in method " + methodName);
            System.exit(0);
        }
        varData.put(paramName, variableDeclaration);
        paramData.put(paramName, variableDeclaration);
        paramTypes.add(variableDeclaration.type);
    }

    public void listVars(){
        System.out.println("Method " + this.methodName + " contains variables: ");
        Set<Map.Entry<String, VariableDeclaration>> entrySet = varData.entrySet();
        for (Map.Entry<String, VariableDeclaration> entry: entrySet){
            System.out.println(entry.getKey() + ": " + entry.getValue().type);
        }
    }

}

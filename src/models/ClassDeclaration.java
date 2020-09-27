package models;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class ClassDeclaration {
    public String className = "";
    public String extendsFrom = "";
    public String extendsTo = "";
    public Hashtable<String, VariableDeclaration> varData;
    public Hashtable<String, MethodDeclaration> methodData;

    public ClassDeclaration(String className){
        this.className = className;
        varData = new Hashtable<String, VariableDeclaration>();
        methodData = new Hashtable<String, MethodDeclaration>();
    }

    public void setExtendsFrom(String extendsFrom) {
        this.extendsFrom = extendsFrom;
    }

    public void insertMethod(String methodName, MethodDeclaration methodDeclaration){
        if(methodData.containsKey(methodName)){
            System.out.println("Multiple declarations of method " + methodName);
            System.exit(0);
        }
        methodData.put(methodName, methodDeclaration);
    }

    public void insertVar(String varName, VariableDeclaration variableDeclaration){
        if(varData.containsKey(varName)){
            System.out.println("Multiple declarations of variable " + varName);
            System.exit(0);
        }
        varData.put(varName, variableDeclaration);
    }

    public void listVars(){
        System.out.println("Class " + this.className + " contains variables: ");
        Set<Map.Entry<String, VariableDeclaration>> entrySet = varData.entrySet();
        for (Map.Entry<String, VariableDeclaration> entry: entrySet){
            System.out.println(entry.getKey() + ": " + entry.getValue().type);
        }
    }

    public void listMethods(){
        System.out.println("Class " + this.className + " contains methods: ");
        Set<Map.Entry<String, MethodDeclaration>> entrySet = methodData.entrySet();
        for(Map.Entry<String, MethodDeclaration> entry: entrySet){
            System.out.println(entry.getKey() + "()");
            entry.getValue().listVars();
            System.out.println("RETURN: " + entry.getValue().type);
        }
    }


}


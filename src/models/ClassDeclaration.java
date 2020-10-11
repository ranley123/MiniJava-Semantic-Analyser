package models;

import javax.annotation.processing.SupportedSourceVersion;
import java.lang.reflect.Method;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class ClassDeclaration {
    public String className = "";
    public String extendsFrom = "";
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

    public boolean hasVar(String name){
        return this.varData.containsKey(name);
    }

    public boolean hasMethod(String name){
        return this.methodData.containsKey(name);
    }

    public void printClass(){
        System.out.println("----------------------------------------------");
        System.out.format("%30s\n", "Class: " + className);
        System.out.println("----------------------------------------------");

        for(Map.Entry<String, VariableDeclaration> e: this.varData.entrySet()){
            System.out.format("%15s%20s", "Variable: " + e.getKey(), "Type: " + e.getValue().type + "\n");
        }
        System.out.println();

        for(Map.Entry<String, MethodDeclaration> entry: methodData.entrySet()){
            System.out.format("%15s%20s", "Method: " + entry.getKey() + "()", "Returns: " + entry.getValue().type + "\n");
            for(Map.Entry<String, VariableDeclaration> e: entry.getValue().paramData.entrySet()){
                System.out.format("%20s%20s",  "Param: " + e.getKey(), "Type: " + e.getValue().type + "\n");
            }
            for(Map.Entry<String, VariableDeclaration> e: entry.getValue().varData.entrySet()){
                if(entry.getValue().paramData.containsKey(e.getKey()))
                    continue;
                System.out.format("%20s%20s",  "Variable: " + e.getKey(), "Type: " + e.getValue().type + "\n");
            }
        }

    }


}


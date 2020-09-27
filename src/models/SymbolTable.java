package models;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class SymbolTable {
    public Hashtable<String, ClassDeclaration> classData = new Hashtable<String, ClassDeclaration>();

    public void SymbolTable(){
//        classData ;
    }

    public void insertClass(String className, ClassDeclaration classDeclaration){
        if(classData.containsKey(className)){
//            throw new Exception("Multiple declarations of class " + className);
            System.out.println("Multiple declarations of class " + className);
            System.exit(0);
        }
//
        String superclassName = classDeclaration.extendsFrom;

        if(superclassName.length() > 0){
            // check superclass exists
            if(!classData.containsKey(superclassName)){
                System.out.println("Class " + superclassName + " has not been declared");
                System.exit(0);
            }

            // check superclass is not itself
            if(className.compareTo(superclassName) == 0){
                System.out.println("Class " + className + " cannot inherit itself");
                System.exit(0);
            }

            // check for circular inheritance

            String grandfather = classData.get(superclassName).extendsFrom;
            if(grandfather.compareTo(className) == 0){
                System.out.println("Class " + className + " cannot have circular inheritance");
                System.exit(0);
            }
        }
        classData.put(className, classDeclaration);
    }

    public void listClasses(){
        System.out.println("Symbol Table contains classes: ");
        Set<Map.Entry<String, ClassDeclaration>> entrySet = classData.entrySet();
        for(Map.Entry<String, ClassDeclaration> entry: entrySet){
            System.out.println(entry.getKey() + " extended from " + entry.getValue().extendsFrom);
        }
    }

    public void listClassesDetailed(){
        System.out.println("Symbol Table contains classes: ");
        Set<Map.Entry<String, ClassDeclaration>> entrySet = classData.entrySet();
        for(Map.Entry<String, ClassDeclaration> entry: entrySet){
            System.out.println(entry.getKey() + " extended from " + entry.getValue().extendsFrom);
            entry.getValue().listVars();
            entry.getValue().listMethods();
        }
    }

    public void printSymbolTable(){
        Set<Map.Entry<String, ClassDeclaration>> entrySet = classData.entrySet();

        for(Map.Entry<String, ClassDeclaration> entry: entrySet){
            final Object[][] table = new String[4][];

            System.out.println("-----------------------------------");
            System.out.println("-----------------------------------");
            System.out.println("Class: " + entry.getKey() + "\n");

            System.out.println("Method");
            System.out.println("-----------------------------------");


        }

    }
}

package models;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 * The symbol table is responsible for store values and corresponding information,
 * including types. It provides printing functions at the end after successful compilation
 *
 */
public class SymbolTable {
    // the hashtable to store all occurred classes
    public Hashtable<String, ClassDeclaration> classData  = new Hashtable<String, ClassDeclaration>();

    /**
     * insert a class. If there is an existing class with the same name, then error comes
     * @param className         - the new class name
     * @param classDeclaration  - the ClassDeclaration storing all variables and methods
     */
    public void insertClass(String className, ClassDeclaration classDeclaration){
        if(classData.containsKey(className)){
            System.out.println("Multiple declarations of class " + className);
            System.exit(0);
        }
        classData.put(className, classDeclaration);
    }

    /**
     * to print all classes' information
     */
    public void listClassesDetailed(){
        System.out.println("Symbol Table contains classes: ");
        Set<Map.Entry<String, ClassDeclaration>> entrySet = classData.entrySet();
        for(Map.Entry<String, ClassDeclaration> entry: entrySet){
            System.out.println(entry.getKey() + " extended from " + entry.getValue().extendsFrom);
            entry.getValue().listVars();
            entry.getValue().listMethods();
        }
    }

    /**
     * print symbol table after successful compilation
     */
    public void printSymbolTable(){
        Set<Map.Entry<String, ClassDeclaration>> entrySet = classData.entrySet();

        for(Map.Entry<String, ClassDeclaration> entry: entrySet){
            final Object[][] table = new String[4][];

            System.out.println("-----------------------------------");
            System.out.println("-----------------------------------");
            entry.getValue().listMethods();


        }

    }
}

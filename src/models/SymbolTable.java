package models;
import java.util.ArrayList;
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
    public int errorNum = 0;

    /**
     * insert a class. If there is an existing class with the same name, then error comes
     * @param className         - the new class name
     * @param classDeclaration  - the ClassDeclaration storing all variables and methods
     */
    public void insertClass(String className, ClassDeclaration classDeclaration){
        if(classData.containsKey(className)){
            System.out.println("Multiple declarations of class " + className);
            errorNum ++;
        }
        classData.put(className, classDeclaration);
    }

    /**
     * Given a class type, get all its super class types
     * @param type  - the type
     * @return      - an ArrayList containing all super class types
     */
    public ArrayList<String> getSuperclassType(String type){
        ArrayList<String> types = new ArrayList<>();
        // now the type is the class name
        String superName = "";
        ClassDeclaration curClass = this.classData.get(type);
        if(curClass == null){
            System.out.println(type + " not declared");
            this.errorNum++;
            return types;
        }
        while(true) {
            superName = curClass.extendsFrom;

            if(superName.length() > 0) {
                types.add(superName);
                curClass = this.classData.get(superName);
            }
            else{
                break;
            }
        }
        return types;
    }

    /**
     * print symbol table after successful compilation
     */
    public void printSymbolTable(){
        if(errorNum == 0){
            Set<Map.Entry<String, ClassDeclaration>> entrySet = classData.entrySet();
            for(Map.Entry<String, ClassDeclaration> entry: entrySet){
                entry.getValue().printClass();
                System.out.println("\n");
            }
        }
        else{
            System.out.println("There are total " + errorNum + " errors");
        }

    }
}

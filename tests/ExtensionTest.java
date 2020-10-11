class ExtensionTest {
    public static void main(String[] a){

        System.out.println(1);
    }
}

class Origin{

}

class Animal extends Origin{
    int age;
}

class Dog extends Animal{
    Origin[] dogs;
    Dog temp;
    public int Start(int i){
        dogs = new Dog[4]; // Origin  = Dog should be passed
        dogs[0] = temp;
        return 1;
    }
}

// Test output: expected successful symbol table information,
// received successful symbol table information
// Test passed
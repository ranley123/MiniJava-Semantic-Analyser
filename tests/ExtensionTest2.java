class ExtensionTest2 {
    public static void main(String[] a){
        // should be passed
        System.out.println(new Dog().age);
    }
}

class Origin{

}

class Animal extends Origin{
    int age;
    float weight; // should be passed
}

class Dog extends Animal{
    Origin[] dogs;
    Dog temp;
    public int Start(int i){
        weight = 111.1; // float should be passed
        dogs = new Origin[4];
        dogs[0] = temp; // Origin = Dog should be passed
        dogs = new Dog[4]; // should be passed
        return 1;
    }
    // Test output: expected successful symbol table information,
    // received successful symbol table information
    // Test passed
}



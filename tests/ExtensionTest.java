class ExtensionTest {
    public static void main(String[] a){
        // should generate 2 errors:
        // 1. no nd defined
        // 2. since it is not defined, then return "null" type to continue. So null didnt match
        System.out.println(new Dog().nd);

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
        // There are 2 errors:
        // 1. there is no Bird defined
        // 2. Bird and Dog dont match even if Bird exists.
        dogs = new Brid[4];
        dogs = new Dog[4];
        dogs[0] = temp;

        // There is an error:
        // float cannot be assigned to an int type
        age = 1.1;
        return 1;
    }
}
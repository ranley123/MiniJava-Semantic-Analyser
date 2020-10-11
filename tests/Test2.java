class Test1 {
    public static void main(String[] a){
        System.out.println(new Test().Start(42, 56, 99));
    }
}

class Animal{
}

class Dog extends Animal{

}

class Test {
    int a;
    int b;
    Animal[] exp;

    public int Start(int bob, int zz , int jj) {
        int x;
        Dog t;
        int[] ids;
        x = bob + zz + jj;
        exp = new Animal[4];
        exp[1] = t;

        return x;
    }

    public int f(int y) {
        y = y + 1;
        return y;
    }
}
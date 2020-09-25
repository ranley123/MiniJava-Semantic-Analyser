class Test1 {
    public static void main(String[] a){
        System.out.println(new Test().Start(42, 56, 99));
    }
}

class Test {
    int a;
    int b;
    public int Start(int bob, int zz , int jj) {
        int x;
        x = bob + zz + jj;

        return x;
    }

    public int f(int y) {
        y = y + 1;
        return y;
    }
}
public class TypeCasting {
    public static void main(String[] args) {
        int a = (int) 0.5;
        System.out.println(a);

        byte asd =1;
        short b;
        char c;
        int d;
        long e;
        float f;
        double g = 500.1;

        int ex1 = asd; //사이즈 증가로는 우행 가능
        double ex2 = asd;

        // int ex3 = g; // 사이즈가 줄어드는 것은 오토매틱하게 불가능함
        int ex3 = (int) g; // 이래야만 가능

    }
}

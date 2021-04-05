public class Conditional {

    public static void main(String[] args) {

        int a = (7>3) ? 7:3; // True : a =7, False : a =3
        System.out.println(a);

        String b = "hello";
        double result = b.equals("hello") ? 0.5: 0.25;
        System.out.println(result);

    }
}

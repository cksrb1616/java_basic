import java.util.Locale;

public class Return {
    public static void main(String[] args) {
        printAMessage();

        int sum = add(5,8);
        System.out.println(sum);

        String shouting = caps("why are you so funny?");
        System.out.println(shouting);

        int[] awesomeArray = gimmeArrayFromInts(5, 1,74);
        System.out.println(awesomeArray);
        System.out.println(awesomeArray[0]);
        System.out.println(awesomeArray[1]);
    }

    public static void printAMessage(){
        System.out.println("This is our first method");
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static String caps(String s) {
        return s.toUpperCase();
    }
    public static int[] gimmeArrayFromInts(int a, int b, int c) {
        int[] array = new int[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        return array;
    }
}

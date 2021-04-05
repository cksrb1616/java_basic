import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {

//        try {
//            int[] a = {4, 5, 6};
//            System.out.println(a[3]);
//        } catch(Exception e) {
//            System.out.println("An exception happened");
//        }

//        Scanner scan = new Scanner(System.in);
//        System.out.println("what's your favorite number?");
//        try {
//            int n = scan.nextInt();
//            System.out.println(n);
//        } catch(Exception e) {
//            System.out.println("sorry, please enter a number");
//        }
        try {
            int[] a = {4};
            System.out.println(a[1]);
        } catch(java.lang.NullPointerException e) {
            System.out.println("your array is null");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("your index is out of bounds");
        } catch(Exception e) {
            System.out.println("something else went wrong");
        }


    }
}

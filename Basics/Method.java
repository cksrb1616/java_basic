import java.util.Scanner;

public class Method {
    public static void main(String[] args){
        welcome();
        multiply(5,10);
    }
    public static void welcome() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your name");
        String name = scan.nextLine();
        System.out.println("welcome "+ name);

    }
    public static void multiply(int a, int b) {
        System.out.println(a*b);
    }
}

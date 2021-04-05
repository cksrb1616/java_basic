import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 포켓몬 01: ");
        String pokemon1 = scan.nextLine();
        System.out.println("Enter 포켓몬 02: ");
        String pokemon2 = scan.nextLine();
        System.out.println("Enter 포켓몬 03: ");
        String pokemon3 = scan.nextLine();
        System.out.println("Enter 포켓몬 04: ");
        String pokemon4 = scan.nextLine();

        System.out.println(pokemon1);
        System.out.println(pokemon2);
        System.out.println(pokemon3);
        System.out.println(pokemon4);



    }
}

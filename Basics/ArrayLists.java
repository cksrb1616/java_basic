import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        String[] fruits = new String[3];
        fruits[0] = "Mango";
        fruits[1]="apple";
        fruits[2] = "strawberry";
        System.out.println(fruits[1]);

        ArrayList fruitList = new ArrayList();
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("Watermellon");
        fruitList.remove("Strawberry");
        fruitList.clear();
        System.out.println(fruitList.contains("Rsdpberry"));
        System.out.println(fruitList);
    }

}

import java.util.HashMap;

public class HashMapAwesome {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int c = 88;

        HashMap<String, Integer> happy = new HashMap<String, Integer>();
        //actual type 이라서 int 가 아닌 Integer
        happy.put("a", 10);
        happy.put("b",3);
        happy.put("c", 88);
        System.out.println(happy.get("c"));

        HashMap<String, String> fun = new HashMap<String, String>();
        fun.put("bobbyjoe12", "fuluffypo");
        fun.put("hellokitty", "aloevera");
        fun.put("collguyswag", "asdfqwe");

//        fun.remove("hellokitty");
        System.out.println(fun.containsValue("asdfqwe"));
        System.out.println(fun.replace("bobbyjoe12","betterpassword"));
        // key를 통해 value 를 리플레이스 함.
        System.out.println(fun);

    }
}

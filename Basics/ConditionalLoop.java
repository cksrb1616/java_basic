public class ConditionalLoop {
    public static void main(String[] args) {
        int[] numbers = {10, 20,30, 40, 50};
        for(int i = 0; i<numbers.length;i++){
            if(numbers[i]==30) {
                break;
            }
            System.out.println(numbers[i]);
        }

        int a = 3;
        switch (a) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            default:
                System.out.println("WTF?");
                break;
        }

        for (int c = 0; c<3; c++) {
            for (int d = 0; d <3; d++) {
                System.out.println(c+","+d);
                break;
            }
        }

    }
}

import java.sql.SQLOutput;

public class ForLoop {
    public static void main(String[] args) {
        for(int i = 0; i<5;i++){
            System.out.println("repeat");
        }
        System.out.println("---------");

        String[] colors ={"red", "green", "blue"};
        for(int i = 0; i<3;i++){
            System.out.println(colors[i]);
        }
        System.out.println("---------");

        String[][] fancyColors2DArray = {{"red", "green", "blue"},
                                            {"Cyan", "Magenta","Turqiouse"}};
        for(int i = 0;i<2;i++) {
            for(int j = 0; j<3;j++) {
                System.out.println(fancyColors2DArray[i][j]);
            }
        }
        System.out.println("-----------");
        for(int i = 0; i< 5; i++){
            for(int k =0;k<10;k++){
                System.out.println("i: " + i + "j: "+k);
            }
        }
    }
}

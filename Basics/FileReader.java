import com.sun.source.tree.WhileLoopTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) throws IOException {
        File file = new File("/../captmidn.txt");
        Scanner scan = new Scanner(file);

        String fileContent = "";
//       *read all the lines
//        while (scan.hasNextLine()) {
//            System.out.println(scan.nextLine());

//      MAKE a new FILE
        while(scan.hasNextLine()) {
            fileContent = fileContent.concat(scan.nextLine() +"\n");
        }
        FileWriter writer = new FileWriter("/Users/minjunchoi/Desktop/NEWcaptmidn.txt");
        writer.write(fileContent);
        writer.close();


    }
}


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) {
        // File f1 = new File("abc.txt");
        // try {
        //     f1.createNewFile();
        // } catch (IOException e) {
        //     System.out.println(e);
        // }
        // try {
        //     FileWriter f2=new FileWriter("xyz.txt");
        //     f2.write("Hello World \n");
        //     f2.write("Java is my favourite language");

        //     f2.close();
        // } catch (IOException e) {
        //     System.out.println(e);
        // }
        File f3 = new File("abc.txt");
        try {
            Scanner sc = new Scanner(f3);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        
    }
}

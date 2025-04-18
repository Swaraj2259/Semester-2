// 14. WAP to demonstrate the File class constructors and any 4 methods of File class
import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        try {
            // File creation
            File file = new File("demo.txt");
            file.createNewFile();

            // Methods demonstration
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("File Exists? " + file.exists());
            System.out.println("File Size (bytes): " + file.length());

            // Deleting file
            file.delete();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 
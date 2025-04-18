import java.io.File;
import java.io.IOException;

public class Q14FileClassDemo {
    public static void main(String[] args) {
        try {
            // Creating a File object
            File file = new File("example.txt");

            // i. Create a new file
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // ii. Check if the file exists
            System.out.println("Does the file exist? " + file.exists());

            // iii. Get file size in bytes
            System.out.println("File size: " + file.length() + " bytes");

            // iv. Delete the file
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete file.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

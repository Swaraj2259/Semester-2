import java.io.FileOutputStream;
import java.io.IOException;

public class Q15fileOutStream {
    public static void main(String[] args) 
    {
        try 
        {
            FileOutputStream fos = new FileOutputStream("ztext1.txt");

            String data = "Hello, this is a test file.";

            fos.write(data.getBytes()); // Write data as bytes

            fos.close(); // Close the stream

            System.out.println("Data written successfully.");
        } 
        catch (IOException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

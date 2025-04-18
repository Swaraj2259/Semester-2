import java.io.FileReader;
import java.io.IOException;

public class Q13fileReader {
    public static void main(String[] args) 
    {
        try 
        {
            FileReader reader = new FileReader("ztext1.txt"); 
            int ch;
            while ((ch = reader.read()) != -1) 
            { 
                System.out.print((char) ch);
            }
            reader.close();
        } 
        catch (IOException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
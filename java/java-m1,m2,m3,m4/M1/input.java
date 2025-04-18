//wap fro accepting single char,int,float,double,string value from the user
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char c = sc.next().charAt(0);
        System.out.println("You entered: " + c);

        System.out.println("Enter an integer:");
        int i = sc.nextInt();
        System.out.println("You entered: " + i);

        System.out.println("Enter a float:");
        float f = sc.nextFloat();
        System.out.println("You entered: " + f);

        System.out.println("Enter a double:");
        double d = sc.nextDouble();
        System.out.println("You entered: " + d);

        System.out.println("Enter a string:");
        String s = sc.next();
        System.out.println("You entered: " + s);
        // sc.close();
    }
}
import java.util.*;

public class Q2greatest {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 3 numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a+" Is the greatest");
            }
            else
            {
                System.out.println(c+ " Is the greatest");
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println(b+" Is the greatest");
            }
            else
            {
                System.out.println(c+" Is the greatest");
            }
        }
        sc.close();
    }
}

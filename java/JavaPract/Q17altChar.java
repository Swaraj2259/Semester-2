import java.util.Scanner;

public class Q17altChar 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();

        System.out.print("Alternate characters: ");
        for (int i = 0; i < input.length(); i += 2) 
        {
            System.out.print(input.charAt(i) + " ");
        }
    }
}

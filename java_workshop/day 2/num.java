import java.util.InputMismatchException;
import java.util.Scanner;
public class num {
    public static void main(String[] args) {
        try {
            System.out.println("Enter two numbers to divide: ");
            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println("The divide of the two numbers is: " + (num1 / num2));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
            System.out.println("exception is: " + e);
        }
        catch(InputMismatchException e){
            System.out.println("Please enter valid numbers");
        }
        catch(Exception e){
            System.out.println("Some error occurred");
        }
        System.out.println("entre age");

        try {
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();
            if(age<=18){
                throw new InvalidAgeException("You are not eligible to vote");
            }
            else{
                System.out.println("You are eligible to vote");
            }
            
        } catch (InvalidAgeException e) {
            System.out.println("exception is: "+e);
        }
    }
}

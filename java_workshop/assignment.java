import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Task 1: Reverse digits of a number using for loop
        System.out.print("Enter a number to reverse: ");
        int num = scanner.nextInt();
        int reversed = 0;
        for (; num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println("Reversed Number: " + reversed);

        // Task 2: Add the digits of a number using while loop
        System.out.print("Enter a number to sum digits: ");
        num = scanner.nextInt();
        int sum = 0, temp = num;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Sum of digits: " + sum);

        // Task 3: Generate 10 Fibonacci numbers using do-while loop
        System.out.println("First 10 Fibonacci numbers:");
        int a = 0, b = 1, count = 0;
        do {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            count++;
        } while (count < 10);
        System.out.println();

        // Task 4: Check if a number is prime
        System.out.print("Enter a number to check prime: ");
        num = scanner.nextInt();
        boolean isPrime = num > 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(num + (isPrime ? " is a prime number." : " is not a prime number."));

        // Task 5: Find factorial of a number
        System.out.print("Enter a number to find factorial: ");
        num = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
        
        scanner.close();
    }
}

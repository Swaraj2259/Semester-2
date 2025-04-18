import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to find the sum of its digits:");
        int num = sc.nextInt();
        int originalNum = num; // To store the original number
        num = Math.abs(num);   // Take the absolute value to handle negative numbers

        int sum = 0;
        while (num > 0) {
            sum += num % 10;  // Add the last digit to sum
            num /= 10;        // Remove the last digit
        }

        System.out.println("Sum of digits of " + originalNum + " is: " + sum);

        sc.close();
    }
}
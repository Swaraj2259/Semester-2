import java.util.Scanner;

class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of terms
        System.out.println("Enter the value of N:");
        int n = sc.nextInt();

        // Variables to store sums and counts
        int oddSum = 0, evenSum = 0;

        // Calculate sums of first N odd and even numbers
        for (int i = 1; i <= n; i++) {
            // Add to oddSum (Odd numbers: 2*i-1)
            oddSum += (2 * i - 1);

            // Add to evenSum (Even numbers: 2*i)
            evenSum += (2 * i);
        }

        // Calculate averages
        double oddAvg = (double) oddSum / n;
        double evenAvg = (double) evenSum / n;

        // Print the results
        System.out.println("The average of the first " + n + " odd numbers is: " + oddAvg);
        System.out.println("The average of the first " + n + " even numbers is: " + evenAvg);

        sc.close();
    }
}
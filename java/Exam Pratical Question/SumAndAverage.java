// 3. WAP to find sum and average of numbers from 1 to 10
public class SumAndAverage {
    public static void main(String[] args) {
        int sum = 0;
        int n = 10;

      
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        double average = (double) sum / n;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
} 
public class Q3sumAVG {
    public static void main(String[] args) {
        
        int sum = 0;
        // int count = 10; 

        for (int i = 1; i <= 10; i++) 
        {
            sum += i;
        }

        int average =sum / 10;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);   
    }
}

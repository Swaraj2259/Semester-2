// Reverse a number
import java.util.Scanner;

class reverseNum{

    public static void main(String[] args) {
        Scanner rev =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=rev.nextInt();
        int reverse=0;
        int rem;
        while(num>0){
            rem=num%10;
            reverse=(reverse*10)+rem;
            num=num/10;
        }
        System.out.println(reverse);
    }
}


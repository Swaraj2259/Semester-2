//armstrong number
// import java.util.Scanner;
// class ArmStrong{
//     public static void main(String[] args) {
//         Scanner arm =new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int num=arm.nextInt();
//         int temp=num;
//         int sum=0;
//         int rem;
//         while(num>0){
//             rem=num%10;
//             sum=sum+(rem*rem*rem);
//             num=num/10;
//         }
//         if(temp==sum){
//             System.out.println("Armstrong number");
//         }
//         else{
//             System.out.println("Not an Armstrong number");
//         }
//     }
// }
//by using power function
import java.util.Scanner;
class ArmStrong{
    public static void main(String[] args) {
        Scanner arm =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=arm.nextInt();
        int temp=num;
        int sum=0;
        int rem;
        int n=0;
        while(num>0){
            num=num/10;
            n++;
        }
        num=temp;
        while(num>0){
            rem=num%10;
            sum=sum+(int)Math.pow(rem,n);
            num=num/10;
        }
        if(temp==sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
    }
}
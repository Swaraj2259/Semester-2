// greatest of 3 numbers using conditional operator
import java.util.Scanner;
class greatest_of_3num{
    public static void main(String[] args) {
        Scanner grt =new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a=grt.nextInt();
        int b=grt.nextInt();
        int c=grt.nextInt();
        int max=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("Greatest number is: "+max);
    }
}
// example of conditional operator
// import java.util.Scanner;
// class conditional
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int num=sc.nextInt();
//         String output=(num%2==0)?"Even number":"Odd number";
//         System.out.println(output);
//     }
// }


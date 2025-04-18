// //wap to find sum of all elements of an array
// import java.util.Scanner;
// class array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of the array");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter the elements of the array");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int sum = 0;
//         for (int i = 0; i < n; i++) {
//             sum += arr[i];
//         }
//         System.out.println("The sum of all elements of the array is " + sum);
//     }
// }


// wap to find sum of all elements of an array using a arr.length
// import java.util.Scanner;
// class array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of the array");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter the elements of the array");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int sum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             sum += arr[i];
//         }
//         System.out.println("The sum of all elements of the array is " + sum);
//     }
// }

// // wap to find sum of 2d array
// import java.util.Scanner;
// class array{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of rows");
//         int rows = sc.nextInt();
//         System.out.println("Enter the number of columns");
//         int cols = sc.nextInt();
//         int[][] arr = new int[rows][cols];
//         System.out.println("Enter the elements of the array");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//     }
// }
// import java.util.Scanner;
// class array{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("entre the no of rows");
//         int rows=sc.nextInt();
//         System.out.println("entre the no of colm");
//         int colm =sc.nextInt();
//         int[][] arr = new int[rows][colm];



//     }

// }


//wap to store a elements of jagged array and print it
import java.util.Scanner;
class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] jaggedArray = new int[4][];
        jaggedArray[0] = new int[1];
        jaggedArray[1] = new int[2];
        jaggedArray[2] = new int[3];
        jaggedArray[3] = new int[4];

        System.out.println("Enter the elements of the jagged array:");
        for (int[] row : jaggedArray) {
            for (int j = 0; j < row.length; j++) {
                row[j] = sc.nextInt();
            }
        }

        System.out.println("The elements of the jagged array are:");
        for (int[] row : jaggedArray) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

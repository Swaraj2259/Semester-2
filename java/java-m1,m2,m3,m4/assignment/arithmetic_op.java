import java.util.Scanner;

class arithmetic_op {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        
            System.out.println("Enter two numbers:");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            
            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for subtraction");
            System.out.println("Enter 3 for multiplication");
            System.out.println("Enter 4 for division");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            
            double result;
            switch (choice) {
                case 1:
                    result = a + b;
                    System.out.println("The result of addition is: " + result);
                    break;
                case 2:
                    result = a - b;
                    System.out.println("The result of subtraction is: " + result);
                    break;
                case 3:
                    result = a * b;
                    System.out.println("The result of multiplication is: " + result);
                    break;
                case 4:
                    if (b != 0) {
                        result = a / b;
                        System.out.println("The result of division is: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}




import java.util.Scanner;

class Student {
    int id;
    String name;
    static String studentclass = "IIM";
    int age;
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student s1 = new Student();

        // Taking user input
        System.out.print("Enter Student ID: ");
        s1.id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Student Name: ");
        s1.name = scanner.nextLine();

        System.out.print("Enter Student Age: ");
        s1.age = scanner.nextInt();

        // Displaying student details
        System.out.println("Student Details: ID - " + s1.id + ", Name - " + s1.name + ", Age - " + s1.age + ", Class - " + Student.studentclass);

        scanner.close(); // Closing the scanner
    }
}

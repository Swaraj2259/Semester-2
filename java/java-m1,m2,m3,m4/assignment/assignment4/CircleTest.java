// Circle class definition
class Circle {
    // Private instance variable with default value
    private double radius = 1.0;

    // Default constructor
    public Circle() {
        // radius is already initialized to 1.0
    }

    // Constructor with a parameter
    public Circle(double radius) {
        this.radius = radius; // Assign the given radius to the instance variable
    }

    // Getter method to get radius
    public double getRadius() {
        return radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

// Main class to test the Circle class
public class CircleTest {
    public static void main(String[] args) {
        // Creating Circle objects
        Circle c1 = new Circle(); // Default constructor
        Circle c2 = new Circle(5.0); // Parameterized constructor

        // Displaying results for default circle
        System.out.println("Circle 1:");
        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Area: " + c1.calculateArea());
        System.out.println("Circumference: " + c1.calculateCircumference());

        // Displaying results for parameterized circle
        System.out.println("\nCircle 2:");
        System.out.println("Radius: " + c2.getRadius());
        System.out.println("Area: " + c2.calculateArea());
        System.out.println("Circumference: " + c2.calculateCircumference());
    }
}
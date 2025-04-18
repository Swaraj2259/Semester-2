// 4. WAP to create a class called Circle. It contains:
// • private instance variable: radius (of the type double)
// • Two overloaded constructors - a default constructor with no argument, and a constructor
// which takes a double argument for radius.
// • Two public methods: getRadius(), calculateArea(), calculateCircumference() which
// return the radius, calculate and return area, and circumference respectively.
// Hint: Use Math.PI for calculating area and circumference
class Circle {
     
    private double radius;

    
    public Circle() {
        radius = 1.0;
    }

   
    public Circle(double radius) {
        this.radius = radius;
    }

  
    public double getRadius() {
        return radius;
    }

   
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

 
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

 
public class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle(); 
        Circle circle2 = new Circle(5.5);  

        System.out.println("Radius of Circle 1: " + circle1.getRadius());
        System.out.println("Area of Circle 1: " + circle1.calculateArea());
        System.out.println("Circumference of Circle 1: " + circle1.calculateCircumference());

        System.out.println("Radius of Circle 2: " + circle2.getRadius());
        System.out.println("Area of Circle 2: " + circle2.calculateArea());
        System.out.println("Circumference of Circle 2: " + circle2.calculateCircumference());
    }
} 
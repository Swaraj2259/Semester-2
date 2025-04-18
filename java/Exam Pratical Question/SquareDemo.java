// 5. WAP to create a class called Square. It contains:
// • private instance variable: side (each of the type double)
// • Two overloaded constructors - a default constructor with no argument, and a constructor
// which takes a double argument for radius.
// • Two public methods: getSide(), calculateArea() which return the side and calculate and
// return area respectively.
class Square {
 
    private double side;

 
    public Square() {
        side = 1.0;
    }

   
    public Square(double side) {
        this.side = side;
    }

 
    public double getSide() {
        return side;
    }

  
    public double calculateArea() {
        return side * side;
    }
}


public class SquareDemo {
    public static void main(String[] args) {
        Square square1 = new Square();  // Default constructor
        Square square2 = new Square(4.5);  // Parameterized constructor

        System.out.println("Side of Square 1: " + square1.getSide());
        System.out.println("Area of Square 1: " + square1.calculateArea());

        System.out.println("Side of Square 2: " + square2.getSide());
        System.out.println("Area of Square 2: " + square2.calculateArea());
    }
} 
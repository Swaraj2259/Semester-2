// 19. Create an interface Shape with draw() method. Then, override draw() in Circle and Square class. WAP to demonstrate this concept.
// Define an interface Shape with draw() method
interface Shape {
    void draw();
}
 
class CircleShape implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

 
class SquareShape implements Shape {
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

 
public class ShapeDemo {
    public static void main(String[] args) {
        Shape circle = new CircleShape();
        Shape square = new SquareShape();

        circle.draw();
        square.draw();
    }
} 
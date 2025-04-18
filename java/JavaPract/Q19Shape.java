interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

public class Q19Shape {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape square = new Square();
        
        circle.draw();
        square.draw();
    }
}

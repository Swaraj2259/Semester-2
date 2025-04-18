import java.math.*;
class Circle
{
    private double radius;

    Circle()
    {
        this.radius=1.0;
    };

    Circle(double radius)
    {
        this.radius=radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public double calcArea()
    {
        double area=Math.PI*radius*radius;
        return area;
    }

    public double calcCircum()
    {
        double area=2*Math.PI*radius;
        return area;
    }
}

public class Q4circle
{
    public static void main(String[] args) {
        Circle c1=new Circle();
        System.out.println(c1.getRadius());
        System.out.println(c1.calcArea());
        System.out.println(c1.calcCircum());

        
        Circle c2=new Circle(5);
        System.out.println(c2.getRadius());
        System.out.println(c2.calcArea());
        System.out.println(c2.calcCircum());
    }
}
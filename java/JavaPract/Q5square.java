class Square
{
    private double side;

    Square()
    {
        this.side=1.0;
    };

    Square(double side)
    {
        this.side=side;
    }

    public double getSide()
    {
        return side;
    }

    public double calcArea()
    {
        double area=side*side;
        return area;
    }
}



public class Q5square {
    public static void main(String[] args) {
        
        Square s1=new Square();
        System.out.println(s1.getSide());
        System.out.println(s1.calcArea());

        Square s2=new Square(10);
        System.out.println(s2.getSide());
        System.out.println(s2.calcArea());
    }
}

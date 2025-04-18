abstract class Shape
{
    abstract void draw();
    public void display() 
    {
        System.out.println("This is a shape.");
    }
}

class Square extends Shape
{
    void draw()
    {
        System.out.println("drawing a square");
    }
}


class Circle extends Shape
{
    void draw()
    {  
        System.out.println("drawing a circle");
    }
}



class Q6abPoly
{
    public static void main(String[] args) {
        
        Square s1=new Square();
        Circle c1=new Circle();

        s1.display();
        s1.draw();
        System.out.println();
        c1.display();
        c1.draw();
    }
}
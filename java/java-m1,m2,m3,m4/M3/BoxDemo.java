class Box{
    double length,breadth,height;
    double Area(){
        return (length*breadth*height);
    }
}
class BoxDemo{
    public static void main(String[] args){
        Box bx1=new Box();
        bx1.length=20;
        bx1.breadth=20;
        bx1.height=20;
        // System.out.println("The area of box is "+ bx1.Area());
        
    }
}
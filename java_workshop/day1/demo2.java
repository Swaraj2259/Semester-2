// package demoproj;

class inheritanceEx {
    public void display() {
        System.out.println("This is a display method of inheritanceEx class");
    }
    
}
class demo1 extends inheritanceEx{
    public void display() {
        System.out.println("This is a display method of demo1 class");
    }

}
public class demo2 {

    public static void main(String[] args) {
        demo1 d1 = new demo1();
        d1.display();
    }

}
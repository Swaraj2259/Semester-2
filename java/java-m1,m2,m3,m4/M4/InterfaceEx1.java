package M4;
// Multiple inheritance in Java by interface
interface Printable {
    void print();
}

interface Showable {
    void show();
}

// Correct class declaration
class InterfaceEx1 implements Printable, Showable {
    public void print() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String args[]) {
        InterfaceEx1 obj = new InterfaceEx1();
        obj.print();
        obj.show();
    }
}
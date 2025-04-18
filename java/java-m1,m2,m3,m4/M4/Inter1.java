// import M4.Printable;
// import M4.Showable;

interface Printable { 
    void print(); 
}

interface Showable extends Printable { 
    void show(); 
}

class Inter1 implements Showable { 
    public void print() { 
        System.out.println("Hello");
    }

    public void show() { 
        System.out.println("Welcome");
    }

    public static void main(String args[]) {
        Inter1 obj = new Inter1(); // Corrected object creation
        obj.print();
        obj.show();
    }
}
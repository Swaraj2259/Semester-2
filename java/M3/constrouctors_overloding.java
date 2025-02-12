
class base {

    base() {
        System.out.println("i am constrouctors from base");
    }

    base(int x) {
        System.out.println("i am overloding constrouctors from base x as: " + x);
    }
}

class Derived extends base {

    Derived() {
        System.out.println("i am constrouctors from derived");
    }

    Derived(int x, int y) {
        super(x);
        System.out.println("i am overloding constrouctors from derived y as: " + y);
    }

}

class grandparent extends Derived {

    grandparent() {

        System.out.println("i am constrouctors from grandparent");
    }

    grandparent(int x, int y, int z) {
        super(x, y);
        System.out.println("i am overloding constrouctors from derived y as: " + z);
    }

}

class constrouctors_overloding {

    public static void main(String[] args) {
        // base b=new base(2);
        // Derived d =new Derived(3,5);
        grandparent cd = new grandparent();
    }
}

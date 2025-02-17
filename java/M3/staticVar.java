// demonstrates static variables,methods and blocks
// static variables are shared among all objects of a class
// static methods can only access static variables
// static blocks are executed when the class is loaded
// static blocks are executed before the constructor
// static blocks are executed only once
// static blocks are executed in the order they appear in the class
// static blocks are executed before the main method
// static blocks are executed before the static methods
 class staticVar {
    static int a = 3;
    static int b;
    static void meth(int x){
        System.out.println("x = "+x);
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    public static void main(String[] args) {
        meth(42);
    }
 }


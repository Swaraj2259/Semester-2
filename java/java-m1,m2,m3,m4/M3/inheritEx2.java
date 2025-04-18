// class A {
//     int i; //default access modifier
//     private int j; //private access modifier

//     void setij(int x, int y){
//         i = x;
//         j = y;
//     }

// }
// class B extends A{
//     int total;
//     void sum(){
//         total = i + j; //error
//     }
// }
// class inheritEx2{
//     public static void main(String[] args) {
//         B subOb = new B();
//         subOb.setij(10, 12);
//         subOb.sum();
//         System.out.println("Total is: " + subOb.total);
//     }
// }
class animal {
    int i;
    String name;
    public void eat(){
        System.out.println("i can eating");
    }
    animal(){}
    animal(String n , int i){
        name = n;
        i = i;
    }
}
class dog extends animal{
    int i;

    public void bark(){
        System.out.println(name + " can bark");
        System.err.println("i"+i+"super.i"+super.i);

    }
    dog(){}
    dog(String n, int i){
        super(n,i);
    }
}

@SuppressWarnings("unused")
class inheritEx2{
    public static void main(String[] args) {
        dog d = new dog();
        d.name = "Tommy";
        d.eat();

        dog d1 = new dog("Tommy", 10 );
        d1.bark();
    }
}
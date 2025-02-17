class animal{
    String name;
    public void eat(){
        System.out.println("i can eating");

    }
}
class dog extends animal{
    public void bark(){
        System.out.println("i can bark");
    }
}
class inheritEx1{
    public static void main(String[] args) {
        dog d = new dog();
        d.name = "Tommy";
        d.eat();
        d.bark();
    }
}

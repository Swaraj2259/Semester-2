class animal {
    String name;
    public void eat(){
        System.out.println(name+" eat");

    }
    animal() {}
    animal(String n){name =n;} 
    
}
class dog extends animal{
    public void bark(){
        System.out.println(name+" bark");
    }
    dog(){}
    @SuppressWarnings("unused")
    dog(String n){super(n);}
}
@SuppressWarnings("unused")
class cat extends animal{
    public void meow(){
        System.out.println(name+" meow");
    }
    

}
@SuppressWarnings("unused")
class HierarInherit {
    public static void main(String[] args) {
        animal a = new animal();
        a.name="dev";
        a.eat();
        // a.bark();
        
        dog d1 = new dog();
        d1 .name= "prasad";
        d1.eat();
        d1.bark();


    }
}
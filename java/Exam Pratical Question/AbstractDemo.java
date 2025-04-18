// 6. WAP to demonstrate how to create abstract class and implement the concept of run time
// polymorphism using abstract class.
 
abstract class Animal {
    abstract void sound();   
}

 
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

 
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

 
public class AbstractDemo {
    public static void main(String[] args) {
        Animal myDog = new Dog();  
        Animal myCat = new Cat();

        myDog.sound();
        myCat.sound();
    }
} 
// 7. WAP to demonstrate the sequence of execution of constructors in multilevel inheritance.
class Grandparent {
    Grandparent() {
        System.out.println("Grandparent constructor called");
    }
}

class Parent extends Grandparent {
    Parent() {
        System.out.println("Parent constructor called");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child constructor called");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Child obj = new Child();  // Child object triggers constructor chain
    }
} 
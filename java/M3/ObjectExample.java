
// class Student {

// // Attributes
//     String name;
//     int age;

// // Method
//     void display() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//     }

// }

// public class ObjectExample {

//     public static void main(String[] args) {
//         Student s1 = new Student(); // Object creation
//         s1.name="prasad";
//         s1.age = 20;

//         Student s2 = new Student();  // Another object
//         s2.name = "swaraj";
//         s2.age = 22;

//         s1.display();
//         s2.display();
//     }

// }

class Student {
     String name;
     int age;
    public Student(String name,int age) {
        this.name = name;
        this.age = age;

    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    }
}
public class ObjectExample {

    public static void main(String[] args) {
        Student s1 = new Student("Prasad", 20);  // Object with values
        Student s2 = new Student("Swaraj", 22);  // Another object
       
    }

}

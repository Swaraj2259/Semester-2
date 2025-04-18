// // 1. WAP to find whether the inputted number is even or odd.
// import java.util.Scanner;

// public class EvenOddCheck {
//     public static void main(String[] args) {
//         // Take input from user
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();

//         // Check if the number is even or odd
//         if (number % 2 == 0) {
//             System.out.println(number + " is Even.");
//         } else {
//             System.out.println(number + " is Odd.");
//         }

//         // Close scanner
//         scanner.close();
//     }
// }



// // 2. WAP to find greatest among three numbers using if-else.
// import java.util.Scanner;

// public class GreatestOfThree {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Take three numbers as input
//         System.out.print("Enter first number: ");
//         int num1 = scanner.nextInt();
//         System.out.print("Enter second number: ");
//         int num2 = scanner.nextInt();
//         System.out.print("Enter third number: ");
//         int num3 = scanner.nextInt();

//         // Find the greatest number using if-else
//         if (num1 >= num2 && num1 >= num3) {
//             System.out.println(num1 + " is the greatest number.");
//         } else if (num2 >= num1 && num2 >= num3) {
//             System.out.println(num2 + " is the greatest number.");
//         } else {
//             System.out.println(num3 + " is the greatest number.");
//         }

//         // Close scanner
//         scanner.close();
//     }
// }


// // 3. WAP to find sum and average of numbers from 1 to 10

// public class SumAndAverage {
//     public static void main(String[] args) {
//         int sum = 0;
//         int n = 10;

//         // Loop from 1 to 10
//         for (int i = 1; i <= n; i++) {
//             sum += i;
//         }

//         double average = (double) sum / n;

//         System.out.println("Sum = " + sum);
//         System.out.println("Average = " + average);
//     }
// }


// // 4. WAP to create a class called Circle. It contains:
// // • private instance variable: radius (of the type double)
// // • Two overloaded constructors - a default constructor with no argument, and a constructor
// // which takes a double argument for radius.
// // • Two public methods: getRadius(), calculateArea(), calculateCircumference() which
// // return the radius, calculate and return area, and circumference respectively.
// // Hint: Use Math.PI for calculating area and circumference
// class Circle {
//     // Private instance variable
//     private double radius;

//     // Default constructor
//     public Circle() {
//         radius = 1.0;
//     }

//     // Parameterized constructor
//     public Circle(double radius) {
//         this.radius = radius;
//     }

//     // Getter method for radius
//     public double getRadius() {
//         return radius;
//     }

//     // Method to calculate area
//     public double calculateArea() {
//         return Math.PI * radius * radius;
//     }

//     // Method to calculate circumference
//     public double calculateCircumference() {
//         return 2 * Math.PI * radius;
//     }
// }

// // Main class
// public class CircleDemo {
//     public static void main(String[] args) {
//         Circle circle1 = new Circle(); // Using default constructor
//         Circle circle2 = new Circle(5.5); // Using parameterized constructor

//         System.out.println("Radius of Circle 1: " + circle1.getRadius());
//         System.out.println("Area of Circle 1: " + circle1.calculateArea());
//         System.out.println("Circumference of Circle 1: " + circle1.calculateCircumference());

//         System.out.println("Radius of Circle 2: " + circle2.getRadius());
//         System.out.println("Area of Circle 2: " + circle2.calculateArea());
//         System.out.println("Circumference of Circle 2: " + circle2.calculateCircumference());
//     }
// }


// // 5. WAP to create a class called Square. It contains:
// // • private instance variable: side (each of the type double)
// // • Two overloaded constructors - a default constructor with no argument, and a constructor
// // which takes a double argument for radius.
// // • Two public methods: getSide(), calculateArea() which return the side and calculate and
// // return area respectively.
// class Square {
//     // Private instance variable
//     private double side;

//     // Default constructor
//     public Square() {
//         side = 1.0;
//     }

//     // Parameterized constructor
//     public Square(double side) {
//         this.side = side;
//     }

//     // Getter method for side
//     public double getSide() {
//         return side;
//     }

//     // Method to calculate area
//     public double calculateArea() {
//         return side * side;
//     }
// }

// // Main class
// public class SquareDemo {
//     public static void main(String[] args) {
//         Square square1 = new Square();  // Default constructor
//         Square square2 = new Square(4.5);  // Parameterized constructor

//         System.out.println("Side of Square 1: " + square1.getSide());
//         System.out.println("Area of Square 1: " + square1.calculateArea());

//         System.out.println("Side of Square 2: " + square2.getSide());
//         System.out.println("Area of Square 2: " + square2.calculateArea());
//     }
// }

// // 6. WAP to demonstrate how to create abstract class and implement the concept of run time
// // polymorphism using abstract class.
// // Abstract class
// abstract class Animal {
//     abstract void sound();  // Abstract method
// }

// // Subclass Dog
// class Dog extends Animal {
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }

// // Subclass Cat
// class Cat extends Animal {
//     void sound() {
//         System.out.println("Cat meows");
//     }
// }

// // Main class
// public class AbstractDemo {
//     public static void main(String[] args) {
//         Animal myDog = new Dog();  // Polymorphism
//         Animal myCat = new Cat();

//         myDog.sound();
//         myCat.sound();
//     }
// }


// // 7. WAP to demonstrate the sequence of execution of constructors in multilevel inheritance.
// class Grandparent {
//     Grandparent() {
//         System.out.println("Grandparent constructor called");
//     }
// }

// class Parent extends Grandparent {
//     Parent() {
//         System.out.println("Parent constructor called");
//     }
// }

// class Child extends Parent {
//     Child() {
//         System.out.println("Child constructor called");
//     }
// }

// public class InheritanceDemo {
//     public static void main(String[] args) {
//         Child obj = new Child();  // Child object triggers constructor chain
//     }
// }

// // 8. WAP to create an object of String class, store “HelloWorld”and perform following
// // operations:
// // i. find length of string
// // ii. find character at the 2nd index
// // iii. find index of a character “a”
// // iv. find a substring having characters present at 2, 3, 4 locations.
// // v. check whether string end with “d”
// public class StringOperations {
//     public static void main(String[] args) {
//         String str = "HelloWorld";

//         System.out.println("Length: " + str.length());
//         System.out.println("Character at index 2: " + str.charAt(2));
//         System.out.println("Index of 'a': " + str.indexOf('a'));
//         System.out.println("Substring (2, 5): " + str.substring(2, 5));
//         System.out.println("Ends with 'd': " + str.endsWith("d"));
//     }
// }


// // 9. WAP to create an object of StringBuilder class and perform following operations:
// // i. append
// // ii. insert
// // iii. replace
// // iv. delete
// // v. reverse

// public class StringBuilderDemo {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("Hello");

//         sb.append(" World");
//         sb.insert(5, " Java");
//         sb.replace(0, 5, "Hi");
//         sb.delete(3, 7);
//         sb.reverse();

//         System.out.println("Final StringBuilder: " + sb);
//     }
// }



// // 10. WAP to create two ArrayLists, list1 and list2 and perform following operations:
// // i. add “A”, ”B”,”C” in list1
// // ii. add “D”, “E”, “F” in list2
// // iii. add all the objects of list2 to list1 with the function call
// // iv. remove “E” from list1
// // v. check whether list1 is empty or not

// import java.util.ArrayList;

// public class ArrayListDemo {
//     public static void main(String[] args) {
//         ArrayList<String> list1 = new ArrayList<>();
//         ArrayList<String> list2 = new ArrayList<>();

//         list1.add("A");
//         list1.add("B");
//         list1.add("C");

//         list2.add("D");
//         list2.add("E");
//         list2.add("F");

//         list1.addAll(list2);
//         list1.remove("E");

//         System.out.println("List1: " + list1);
//         System.out.println("Is list1 empty? " + list1.isEmpty());
//     }
// }



// 11. WAP to create a HashSet "hs"
// i. add
// ii. get the number of elements in a hash set
// iii. to iterate through all elements in a hash set
// iv. to add the specified element in hash set
// v. to Remove the specified element from the HashSet

// import java.util.HashSet;

// public class HashSetDemo {
//     public static void main(String[] args) {
//         // Create a HashSet and add elements
//         HashSet<String> hs = new HashSet<>();
//         hs.add("Apple");
//         hs.add("Banana");
//         hs.add("Cherry");

//         // Get the number of elements
//         System.out.println("Size of HashSet: " + hs.size());

//         // Iterate through elements
//         System.out.println("HashSet elements:");
//         for (String item : hs) {
//             System.out.println(item);
//         }

//         // Add a new element
//         hs.add("Mango");

//         // Remove an element
//         hs.remove("Banana");

//         System.out.println("HashSet after modification: " + hs);
//     }
// }

// // 12. WAP to implement the following methods of LinkedList:
// // i. to remove last element from a linked list
// // ii. to Retrieve but does not Remove, the Last Element of a LinkedList
// // iii. To print all the elements of LinkedList
// // iv. to remove all the elements from a linked list

// import java.util.LinkedList;

// public class LinkedListDemo {
//     public static void main(String[] args) {
//         LinkedList<String> list = new LinkedList<>();

//         list.add("A");
//         list.add("B");
//         list.add("C");
//         list.add("D");

//         // Remove last element
//         list.removeLast();

//         // Retrieve but don't remove the last element
//         System.out.println("Last Element: " + list.peekLast());

//         // Print all elements
//         System.out.println("LinkedList elements: " + list);

//         // Remove all elements
//         list.clear();
//         System.out.println("LinkedList after clearing: " + list);
//     }
// }

// // 13. WAP to demonstrate how to read a text file using FileReader.

// import java.io.FileReader;
// import java.io.IOException;

// public class FileReadExample {
//     public static void main(String[] args) {
//         try (FileReader fr = new FileReader("example.txt")) {
//             int i;
//             while ((i = fr.read()) != -1) {
//                 System.out.print((char) i);
//             }
//         } catch (IOException e) {
//             System.out.println("Error reading file: " + e.getMessage());
//         }
//     }
// }

// // 14. WAP to demonstrate the File class constructors and any 4 methods of File class

// import java.io.File;
// import java.io.IOException;

// public class FileDemo {
//     public static void main(String[] args) {
//         try {
//             // File creation
//             File file = new File("demo.txt");
//             file.createNewFile();

//             // Methods demonstration
//             System.out.println("File Name: " + file.getName());
//             System.out.println("Absolute Path: " + file.getAbsolutePath());
//             System.out.println("File Exists? " + file.exists());
//             System.out.println("File Size (bytes): " + file.length());

//             // Deleting file
//             file.delete();
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }

// // 15. WAP to demonstrate how to write a text file using FileOutputStream.

// import java.io.FileOutputStream;
// import java.io.IOException;

// public class FileWriteExample {
//     public static void main(String[] args) {
//         String text = "Hello, this is a Java file output demo!";

//         try (FileOutputStream fos = new FileOutputStream("output.txt")) {
//             fos.write(text.getBytes());
//             System.out.println("File written successfully.");
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }

// // 16. Write a Java program to display all the vowels from a given string.

// public class VowelExtractor {
//     public static void main(String[] args) {
//         String input = "Programming in Java";
//         String vowels = "aeiouAEIOU";

//         System.out.print("Vowels in the string: ");
//         for (int i = 0; i < input.length(); i++) {
//             if (vowels.indexOf(input.charAt(i)) != -1) {
//                 System.out.print(input.charAt(i) + " ");
//             }
//         }
//     }
// }

// // 17. Write a Java program to display alternate characters from a given string.

// public class AlternateCharacters {
//     public static void main(String[] args) {
//         String input = "JavaProgramming";

//         System.out.print("Alternate characters: ");
//         for (int i = 0; i < input.length(); i += 2) {
//             System.out.print(input.charAt(i));
//         }
//     }
// }

// // 18. Create a Swing application that calculates a square of a number.

// import javax.swing.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class SquareCalculator extends JFrame {
//     public SquareCalculator() {
//         JTextField numberField = new JTextField();
//         numberField.setBounds(50, 50, 200, 30);

//         JButton calculateButton = new JButton("Calculate Square");
//         calculateButton.setBounds(50, 100, 200, 30);

//         JLabel resultLabel = new JLabel("Result: ");
//         resultLabel.setBounds(50, 150, 200, 30);

//         calculateButton.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 int number = Integer.parseInt(numberField.getText());
//                 resultLabel.setText("Result: " + (number * number));
//             }
//         });

//         add(numberField);
//         add(calculateButton);
//         add(resultLabel);

//         setSize(300, 300);
//         setLayout(null);
//         setVisible(true);
//         setDefaultCloseOperation(EXIT_ON_CLOSE);
//     }

//     public static void main(String[] args) {
//         new SquareCalculator();
//     }
// }


// // 19. Create an interface Shape with draw() method. Then, override draw() in Circle and Square class. WAP to demonstrate this concept.
// // Define an interface Shape with draw() method
// interface Shape {
//     void draw();
// }

// // Circle class implements Shape
// class CircleShape implements Shape {
//     public void draw() {
//         System.out.println("Drawing a Circle");
//     }
// }

// // Square class implements Shape
// class SquareShape implements Shape {
//     public void draw() {
//         System.out.println("Drawing a Square");
//     }
// }

// // Main class to demonstrate the interface concept
// public class ShapeDemo {
//     public static void main(String[] args) {
//         Shape circle = new CircleShape();
//         Shape square = new SquareShape();

//         circle.draw();
//         square.draw();
//     }
// }



// // 20. Create a Swing application that adds two numbers
// import javax.swing.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class AddTwoNumbers extends JFrame {
//     public AddTwoNumbers() {
//         // First number input field
//         JTextField numberField1 = new JTextField();
//         numberField1.setBounds(50, 50, 100, 30);

//         // Second number input field
//         JTextField numberField2 = new JTextField();
//         numberField2.setBounds(160, 50, 100, 30);

//         // Button to perform addition
//         JButton addButton = new JButton("Add");
//         addButton.setBounds(50, 100, 100, 30);

//         // Result label to show the sum
//         JLabel resultLabel = new JLabel("Result: ");
//         resultLabel.setBounds(50, 150, 200, 30);

//         // Button action listener
//         addButton.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 int number1 = Integer.parseInt(numberField1.getText());
//                 int number2 = Integer.parseInt(numberField2.getText());
//                 int sum = number1 + number2;
//                 resultLabel.setText("Result: " + sum);
//             }
//         });

//         // Add components to the frame
//         add(numberField1);
//         add(numberField2);
//         add(addButton);
//         add(resultLabel);

//         // Frame settings
//         setSize(300, 300);
//         setLayout(null);
//         setVisible(true);
//         setDefaultCloseOperation(EXIT_ON_CLOSE);
//     }

//     public static void main(String[] args) {
//         new AddTwoNumbers();
//     }
// }
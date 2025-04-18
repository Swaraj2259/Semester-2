//question 1 
// import java.util.*;
// public class Q1evenOdd {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);

//         System.out.println("Enter the number to check");
//         int a = sc.nextInt();

//         if(a%2==0)
//         {
//             System.out.println("Even");
//         }
//         else
//         {
//            System.out.println("Odd");
//         }
//         sc.close();
//     }
// }

// import java.util.*;

// public class greatestof3 {
//     public static void main(String[] args) {
        
//         Scanner sc=new Scanner(System.in);

//         System.out.println("Enter 3 numbers");
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int c=sc.nextInt();

//         if(a>b)
//         {
//             if(a>c)
//             {
//                 System.out.println(a+" Is the greatest");
//             }
//             else
//             {
//                 System.out.println(c+ " Is the greatest");
//             }
//         }
//         else
//         {
//             if(b>c)
//             {
//                 System.out.println(b+" Is the greatest");
//             }
//             else
//             {
//                 System.out.println(c+" Is the greatest");
//             }
//         }
//         sc.close();
//     }
// }

//  public class Q3sumAVG {
//     public static void main(String[] args) {
        
//         int sum = 0;
//         int count = 10; 

//         for (int i = 1; i <= count; i++) 
//         {
//             sum += i;
//         }

//         int average =sum / count;

//         System.out.println("Sum: " + sum);
//         System.out.println("Average: " + average);   
//     }
// }
// import java.math.*;
// class Circle
// {
//     private double radius;

//     Circle()
//     {
//         this.radius=1.0;
//     };

//     Circle(double radius)
//     {
//         this.radius=radius;
//     }

//     public double getRadius()
//     {
//         return radius;
//     }

//     public double calcArea()
//     {
//         double area=Math.PI*radius*radius;
//         return area;
//     }

//     public double calcCircum()
//     {
//         double area=2*Math.PI*radius;
//         return area;
//     }
// }

// public class Q4circle
// {
//     public static void main(String[] args) {
//         Circle c1=new Circle();
//         System.out.println(c1.getRadius());
//         System.out.println(c1.calcArea());
//         System.out.println(c1.calcCircum());

        
//         Circle c2=new Circle(5);
//         System.out.println(c2.getRadius());
//         System.out.println(c2.calcArea());
//         System.out.println(c2.calcCircum());
//     }
// }

// class Square
// {
//     private double side;

//     Square()
//     {
//         this.side=1.0;
//     };

//     Square(double side)
//     {
//         this.side=side;
//     }

//     public double getSide()
//     {
//         return side;
//     }

//     public double calcArea()
//     {
//         double area=side*side;
//         return area;
//     }
// }



// public class Q5square {
//     public static void main(String[] args) {
        
//         Square s1=new Square();
//         System.out.println(s1.getSide());
//         System.out.println(s1.calcArea());

//         Square s2=new Square(10);
//         System.out.println(s2.getSide());
//         System.out.println(s2.calcArea());
//     }
// }

// abstract class Shape
// {
//     abstract void draw();
//     public void display() 
//     {
//         System.out.println("This is a shape.");
//     }
// }

// class Square extends Shape
// {
//     void draw()
//     {
//         System.out.println("drawing a square");
//     }
// }


// class Circle extends Shape
// {
//     void draw()
//     {  
//         System.out.println("drawing a circle");
//     }
// }



// class Q6abPoly
// {
//     public static void main(String[] args) {
        
//         Square s1=new Square();
//         Circle c1=new Circle();

//         s1.display();
//         s1.draw();
//         System.out.println();
//         c1.display();
//         c1.draw();
//     }
// }

// class Level1
// {
//     Level1(){System.out.println("Inside the constructor of level1");}
// }

// class Level2 extends Level1
// {
//     Level2(){System.out.println("Inside the constructor of level2");}
// }

// class Level3 extends Level2
// {
//     Level3(){System.out.println("Inside the constructor of level3");}
// }



// public class Q7multInheri {
//     public static void main(String[] args) {
//         Level3 obj=new Level3();
//     }
// }


// public class Q8string {
//     public static void main(String[] args) {
        
//         String s="Hello World";
//         System.out.println(s.length());
//         System.out.println(s.charAt(2));
//         System.out.println(s.indexOf('a'));
//         System.out.println(s.subSequence(2, 5));
//         System.out.println(s.endsWith("d"));
//     }
// }


// public class Q9stringBuilder {
//     public static void main(String[] args) {
//         StringBuilder sb=new StringBuilder("Hello");

//         sb.append(" World");
//         System.out.println("After append: " + sb);

//         sb.insert(11, " Insert");
//         System.out.println("After insert: " + sb);

//         sb.replace(6, 11, "Replaced");
//         System.out.println("After replace: " + sb);
        
//         sb.delete(15, 20);
//         System.out.println("After delete: " + sb); 

//         sb.reverse();
//         System.out.println("After reverse: " + sb);
//     }
// }


// import java.util.ArrayList;
// public class Q10arrayList {
//     public static void main(String[] args) {
//         ArrayList<String> list1 = new ArrayList<>();
//         ArrayList<String> list2 = new ArrayList<>();

//         // i. Add "A", "B", "C" in list1
//         list1.add("A");
//         list1.add("B");
//         list1.add("C");
//         System.out.println("list1 after adding A, B, C: " + list1);

//         // ii. Add "D", "E", "F" in list2
//         list2.add("D");
//         list2.add("E");
//         list2.add("F");
//         System.out.println("list2 after adding D, E, F: " + list2);

//         // iii. Add all objects of list2 to list1
//         list1.addAll(list2);
//         System.out.println("list1 after adding all from list2: " + list1);

//         // iv. Remove "E" from list1
//         list1.remove("E");
//         System.out.println("list1 after removing E: " + list1);

//         // v. Check if list1 is empty
//         System.out.println("Is list1 empty? " + list1.isEmpty());
//     }
// }


// import java.util.HashSet;
// import java.util.Iterator;

// public class Q11Hash{
//     public static void main(String[] args) 
//     {
//         // i. Create HashSet and add elements
//         HashSet<String> hs = new HashSet<>();
//         hs.add("A");
//         hs.add("B");
//         hs.add("C");
//         System.out.println("HashSet after adding elements: " + hs);

//         // ii. Get number of elements in the HashSet
//         System.out.println("Size of HashSet: " + hs.size());

//         // iii. Iterate through all elements
//         System.out.println("Iterating through HashSet:");
//         Iterator<String> it = hs.iterator();
//         while (it.hasNext()) {
//             System.out.println(it.next());
//         }

//         // iv. Add a specified element
//         hs.add("abcd");
//         System.out.println("HashSet after adding 'abcd': " + hs);

//         // v. Remove a specified element
//         hs.remove("abcd");
//         System.out.println("HashSet after removing 'abcd': " + hs);
//     }
// }


// import java.util.LinkedList;

// public class Q12linked {
//     public static void main(String[] args) 
//     {
//         // Creating LinkedList and add elements
//         LinkedList<String> list = new LinkedList<>();
//         list.add("A");
//         list.add("B");
//         list.add("C");
//         list.add("D");
//         System.out.println("LinkedList after adding elements: " + list);

//         // i. Remove last element
//         list.removeLast();
//         System.out.println("After removing last element: " + list);

//         // ii. Retrieve but do not remove the last element
//         String lastElement = list.getLast();
//         System.out.println("Last element (retrieved but not removed): " + lastElement);

//         // iii. Print all elements
//         System.out.println("All elements in LinkedList:");
//         for (String item : list) {
//             System.out.println(item);
//         }

//         // iv. Remove all elements
//         list.clear();
//         System.out.println("LinkedList after removing all elements: " + list);
//     }
// }


// import java.io.FileReader;
// import java.io.IOException;

// public class Q13fileReader {
//     public static void main(String[] args) 
//     {
//         try 
//         {
//             FileReader reader = new FileReader("ztext1.txt"); 
//             int ch;
//             while ((ch = reader.read()) != -1) 
//             { 
//                 System.out.print((char) ch);
//             }
//             reader.close();
//         } 
//         catch (IOException e) 
//         {
//             System.out.println("Error: " + e.getMessage());
//         }
//     }
// }


// import java.io.File;
// import java.io.IOException;

// public class Q14FileClassDemo {
//     public static void main(String[] args) {
//         try {
//             // Creating a File object
//             File file = new File("example.txt");

//             // i. Create a new file
//             if (file.createNewFile()) {
//                 System.out.println("File created: " + file.getName());
//             } else {
//                 System.out.println("File already exists.");
//             }

//             // ii. Check if the file exists
//             System.out.println("Does the file exist? " + file.exists());

//             // iii. Get file size in bytes
//             System.out.println("File size: " + file.length() + " bytes");

//             // iv. Delete the file
//             if (file.delete()) {
//                 System.out.println("File deleted successfully.");
//             } else {
//                 System.out.println("Failed to delete file.");
//             }
//         } catch (IOException e) {
//             System.out.println("An error occurred: " + e.getMessage());
//         }
//     }
// }


// import java.io.FileOutputStream;
// import java.io.IOException;

// public class Q15fileOutStream {
//     public static void main(String[] args) 
//     {
//         try 
//         {
//             FileOutputStream fos = new FileOutputStream("ztext1.txt");

//             String data = "Hello, this is a test file.";

//             fos.write(data.getBytes()); // Write data as bytes

//             fos.close(); // Close the stream

//             System.out.println("Data written successfully.");
//         } 
//         catch (IOException e) 
//         {
//             System.out.println("Error: " + e.getMessage());
//         }
//     }
// }

// import java.util.Scanner;

// public class Q16vowels {
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a string: ");
//         String input = sc.nextLine();

//         sc.close();

//         System.out.print("Vowels in the string: ");

//         for (int i = 0; i < input.length(); i++) 
//         {
//             char ch = Character.toLowerCase(input.charAt(i));

//             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
//             {
//                 System.out.print(input.charAt(i) + " ");
//             }
//         }
//     }
// }


// import java.util.Scanner;

// public class Q17altChar 
// {
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String input = sc.nextLine();
//         sc.close();

//         System.out.print("Alternate characters: ");
//         for (int i = 0; i < input.length(); i += 2) 
//         {
//             System.out.print(input.charAt(i) + " ");
//         }
//     }
// }


// import javax.swing.*;
// import java.awt.event.*;

// public class Q18sq extends JFrame 
// {
//     private JTextField inputField, resultField;
//     private JButton calculateButton;

//     public Q18sq() 
//     {
//         setTitle("Square Calculator");
//         setSize(300, 150);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLayout(null);

//         JLabel label = new JLabel("Enter a number:");
//         label.setBounds(20, 20, 100, 25);
//         add(label);

//         inputField = new JTextField();
//         inputField.setBounds(130, 20, 100, 25);
//         add(inputField);

//         calculateButton = new JButton("Calculate");
//         calculateButton.setBounds(80, 50, 100, 30);
//         add(calculateButton);

//         resultField = new JTextField();
//         resultField.setBounds(80, 90, 100, 25);
//         resultField.setEditable(false);
//         add(resultField);

//         calculateButton.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 try {
//                     int num = Integer.parseInt(inputField.getText());
//                     resultField.setText(String.valueOf(num * num));
//                 } catch (NumberFormatException ex) {
//                     JOptionPane.showMessageDialog(null, "Enter a valid number!");
//                 }
//             }
//         });

//         setVisible(true);
//     }

//     public static void main(String[] args) {
//         new Q18sq();
//     }
// }

// interface Shape {
//     void draw();
// }

// class Circle implements Shape {
//     public void draw() {
//         System.out.println("Drawing a Circle");
//     }
// }

// class Square implements Shape {
//     public void draw() {
//         System.out.println("Drawing a Square");
//     }
// }

// public class Q19Shape {
//     public static void main(String[] args) {
//         Shape circle = new Circle();
//         Shape square = new Square();
        
//         circle.draw();
//         square.draw();
//     }
// }


// import javax.swing.*;
// import java.awt.event.*;

// public class Q20add extends JFrame {
//     private JTextField num1Field, num2Field, resultField;
//     private JButton addButton;

//     public Q20add() {
//         setTitle("Addition Calculator");
//         setSize(300, 200);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLayout(null);

//         JLabel label1 = new JLabel("Number 1:");
//         label1.setBounds(20, 20, 80, 25);
//         add(label1);

//         num1Field = new JTextField();
//         num1Field.setBounds(100, 20, 100, 25);
//         add(num1Field);

//         JLabel label2 = new JLabel("Number 2:");
//         label2.setBounds(20, 50, 80, 25);
//         add(label2);

//         num2Field = new JTextField();
//         num2Field.setBounds(100, 50, 100, 25);
//         add(num2Field);

//         addButton = new JButton("Add");
//         addButton.setBounds(80, 80, 100, 30);
//         add(addButton);

//         resultField = new JTextField();
//         resultField.setBounds(80, 120, 100, 25);
//         resultField.setEditable(false);
//         add(resultField);

//         addButton.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 try {
//                     int num1 = Integer.parseInt(num1Field.getText());
//                     int num2 = Integer.parseInt(num2Field.getText());
//                     resultField.setText(String.valueOf(num1 + num2));
//                 } catch (NumberFormatException ex) {
//                     JOptionPane.showMessageDialog(null, "Enter valid numbers!");
//                 }
//             }
//         });

//         setVisible(true);
//     }

//     public static void main(String[] args) {
//         new Q20add();
//     }
// }

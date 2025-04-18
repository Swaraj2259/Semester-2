// package demoproj;

public class StringEx {
    public static void main(String[] args) {
    String str = "Hello World";

    str.concat("Java");
    System.out.println(str);

   
    StringBuilder s1 = new StringBuilder("Hello");
    s1.append("World");
    System.out.println(s1);
    
    s1.append(" Java").deleteCharAt(1).append(" World");
    String newString = s1.toString();
    System.out.println(newString);
    }
}

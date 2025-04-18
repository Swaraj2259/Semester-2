// 8. WAP to create an object of String class, store "HelloWorld"and perform following
// operations:
// i. find length of string
// ii. find character at the 2nd index
// iii. find index of a character "a"
// iv. find a substring having characters present at 2, 3, 4 locations.
// v. check whether string end with "d"
public class StringOperations {
    public static void main(String[] args) {
        String str = "HelloWorld";

        System.out.println("Length: " + str.length());
        System.out.println("Character at index 2: " + str.charAt(2));
        System.out.println("Index of 'a': " + str.indexOf('a'));
        System.out.println("Substring (2, 5): " + str.substring(2, 5));
        System.out.println("Ends with 'd': " + str.endsWith("d"));
    }
} 
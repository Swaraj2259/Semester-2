// 16. Write a Java program to display all the vowels from a given string.
public class VowelExtractor {
    public static void main(String[] args) {
        String input = "Programming in Java";
        String vowels = "aeiouAEIOU";

        System.out.print("Vowels in the string: ");
        for (int i = 0; i < input.length(); i++) {
            if (vowels.indexOf(input.charAt(i)) != -1) {
                System.out.print(input.charAt(i) + " ");
            }
        }
    }
} 
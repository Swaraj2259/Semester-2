// 17. Write a Java program to display alternate characters from a given string.
public class AlternateCharacters {
    public static void main(String[] args) {
        String input = "JavaProgramming";

        System.out.print("Alternate characters: ");
        for (int i = 0; i < input.length(); i += 2) {
            System.out.print(input.charAt(i));
        }
    }
} 
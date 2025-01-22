public class StringExamples {

    public static void main(String[] args) {

        // 1. Creating Strings
        String literalString = "Hello";
        String newString = new String("World");
    
        System.out.println("Literal String: " + literalString);
        System.out.println("New String: " + newString);

        // 2. Finding the Length of a String
        System.out.println("Length of literalString: " + literalString.length());

        // 3. Accessing Characters
        System.out.println("Character at index 1 in literalString: " + literalString.charAt(1));

        // 4. Concatenating Strings
        String concatenated = literalString + " " + newString;
        System.out.println("Concatenated String: " + concatenated);

        // 5. Changing Case
        System.out.println("Uppercase: " + concatenated.toUpperCase());
        System.out.println("Lowercase: " + concatenated.toLowerCase());

        // 6. Comparing Strings
        String str1 = "Java";
        String str2 = "java";

        System.out.println("Are str1 and str2 equal (case-sensitive)? " + str1.equals(str2));
        System.out.println("Are str1 and str2 equal (case-insensitive)? " + str1.equalsIgnoreCase(str2));

        // 7. Extracting a Substring
        String extracted = "Programming".substring(0, 4);
        System.out.println("Extracted substring: " + extracted);

        // 8. Replacing Characters
        String sentence = "Java is fun";
        System.out.println("Replaced sentence: " + sentence.replace("fun", "awesome"));

        // 9. Splitting a String
        String fruits = "apple,banana,cherry";
        String[] fruitArray = fruits.split(",");
        System.out.println("Fruits after splitting:");
        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }

        // 10. Trimming Whitespace
        String spacedString = "   Hello World   ";
        System.out.println("Trimmed String: '" + spacedString.trim() + "'");

        // 11. Checking if a String Contains Another String
        System.out.println("Does sentence contain 'Java'? " + sentence.contains("Java"));

        // 12. Checking Palindrome
        String palindrome = "madam";
        String reversed = "";
        for (int i = palindrome.length() - 1; i >= 0; i--) {
            reversed += palindrome.charAt(i);
        }
        if (palindrome.equals(reversed)) {
            System.out.println("'" + palindrome + "' is a Palindrome");
        } else {
            System.out.println("'" + palindrome + "' is NOT a Palindrome");
        }

        // 13. Counting Words in a String
        String wordsSentence = "Hello World from Java";
        String[] words = wordsSentence.split(" ");
        System.out.println("Word count: " + words.length);


        // 14. String Comparison with '==' vs 'equals()'
        String poolString1 = "Java";
        String poolString2 = "Java";
        String heapString1 = new String("Java");
        String heapString2 = new String("Java");

        System.out.println("poolString1 == poolString2: " + (poolString1 == poolString2)); // True, same reference
        System.out.println("heapString1 == heapString2: " + (heapString1 == heapString2)); // False, different objects
        System.out.println("heapString1.equals(heapString2): " + heapString1.equals(heapString2)); // True, same content
    }
}


// import java.util.Arrays;

// class stringEx1
// {
//     public static void main(String[] args) {
//         System.out.println("hello");
//         String sm1="Hello";
//         System.out.println("Length of string is "+sm1.length());
//         System.out.println("String is empty or not"+"".isEmpty());
//         String sm2="this is an index";
//         int index1=sm2.indexOf("is");
//         System.out.println(index1);

//         int index2=sm2.indexOf("is",4);
//         System.out.println(index2);
        
//         System.out.println("");

//         int index3=sm2.indexOf('s',7);
//         System.out.println("index3");

//         int index6=sm2.indexOf("iss",5);
//         System.out.println(index6);

//         int index7=sm2.lastIndexOf("e");
//         System.out.println(index7);

//         int index8=sm2.lastIndexOf("e",5);
//         System.out.println(index8);

//         String ss1="Substrign example";
//         String ss2=ss1.substring(0,5);
//         System.out.println(ss2);
//         String ss3=ss1.substring(5);
//         System.out.println(ss3);
//         String ss4=ss1.substring(5,10);
//         System.out.println(ss4);
//         char sm3;
//         char []arr= new char[10];
//         Arrays.fill(arr,'.');
//         sm3.getChars(0,3,arr,1);
//         System.out.println(Arrays.toString(arr));

//         String e1="java";
//         String e2="java";
//         String e3="JAVA";
//         String e4="python";
//         String e5=new String("java");
//         System.out.println(e1.equals(e2));
//         System.out.println(e1.equals(e3));
//         System.out.println(e1.equals(e4));
//         System.out.println("e1 equals e5"+e1.equals(e5));
//     }
// }


import java.util.Arrays;

class stringEx1 {
    public static void main(String[] args) {
        // Substring Example
        // String ss1 = "Hello";
        // This line would throw an exception because the start and end index are the same.
        // Corrected: Removed invalid substring example.
        // System.out.println("ss1 1,1 :" + ss1.substring(1, 1));

        // getChars Example
        String sm3 = "Hello";
        char[] arr = new char[10];
        Arrays.fill(arr, '.'); // Fill the array with dots.
        sm3.getChars(0, 3, arr, 1); // Copy first 3 characters of sm3 to arr starting at index 1.
        System.out.println(Arrays.toString(arr));

        // equals() Example
        // String e1 = "java";
        // String e2 = "java";
        // String e3 = "JAVA";
        // String e4 = "python";
        // String e5 = new String("java");
        // System.out.println(e1.equals(e2)); // true
        // System.out.println(e1.equals(e3)); // false
        // System.out.println(e1.equals(e4)); // false
        // System.out.println("e1 equals e5: " + e1.equals(e5)); // true

        // equalsIgnoreCase() Example
        // if (e1.equalsIgnoreCase(e3)) {
        //     System.out.println("Both strings are equal");
        // } else {
        //     System.out.println("Both strings are unequal");
        // }

        // compareTo() Example
        String c1 = "hello";
        String c2 = "hello";
        System.out.println(c1.compareTo(c2)); // 0

        String c3 = "ieklo";
        System.out.println(c1.compareTo(c3)); // < 0

        String c4 = "heklo";
        System.out.println(c1.compareTo(c4)); // > 0

        String c5 = "flagship";
        System.out.println(c1.compareTo(c5)); // > 0

        String c6 = "Hello";
        System.out.println(c1.compareTo(c6)); // > 0 (case-sensitive)

        // compareToIgnoreCase() Example
        System.out.println(c1.compareToIgnoreCase(c6)); // 0

        // startsWith and endsWith Examples
        String sw1 = "hello world";
        System.out.println(sw1.startsWith("ll")); // false
        System.out.println(sw1.startsWith("ll", 2)); // true
        System.out.println(sw1.endsWith("ld")); // true

        // contains() Example
        String co1 = "Hello, World";
        System.out.println(co1.contains("hello")); // false (case-sensitive)
        System.out.println(co1.contains("ello")); // true

        // join() Example
        String msg = String.join("-", "Java", "is", "cool");
        System.out.println(msg);

        String msg1 = String.join("*", "Java", null, "cool");
        System.out.println(msg1);

        // The next line would throw an exception due to all `null` elements.
        // Commented to avoid runtime error:
        // String msg2 = String.join("#", null, null, null);
        // System.out.println(msg2);

        // toLowerCase() and toUpperCase()
        System.out.println(msg.toLowerCase());
        System.out.println(msg.toUpperCase());

        // isEmpty() and isBlank() Examples
        System.out.println("".isEmpty()); // true
        System.out.println("".length()); // 0
        System.out.println(" ".isEmpty()); // false
        System.out.println(" ".length()); // 1
        System.out.println("\t\n".isEmpty()); // false
        System.out.println("\t\n".length()); // 2
        System.out.println(" ".isBlank()); // true
        System.out.println("\ta\n".isEmpty()); // false
        System.out.println("\ta\n".isBlank()); // false

        // replace() Example
        String str = "Hello World";
        String replaced = str.replace("o", "a");
        System.out.println("replace: " + replaced);

        // toCharArray() Example
        String sca = "hello";
        char[] ch1 = sca.toCharArray();
        System.out.println(Arrays.toString(ch1));

        // split() Example
        String text = "Java is fun programming language";
        String[] result = text.split(" ");
        System.out.println(Arrays.toString(result));

        // trim() Example
        String trimExample = "   Java   ";
        System.out.println(trimExample.trim()); // "Java"

        // strip(), stripLeading(), stripTrailing()
        String stripExample = "   Java   ";
        System.out.println(stripExample.strip()); // "Java"
        System.out.println(stripExample.stripLeading()); // "Java   "
        System.out.println(stripExample.stripTrailing()); // "   Java"

        // valueOf() Examples
        double num = 123.456;
        System.out.println(String.valueOf(num)); // "123.456"

        long longNum = 123456789L;
        System.out.println(String.valueOf(longNum)); // "123456789"

        Object obj = "Java";
        System.out.println(String.valueOf(obj)); // "Java"

        char[] chars = { 'H', 'e', 'l', 'l', 'o' };
        System.out.println(String.valueOf(chars)); // "Hello"
    }
}

    //  //he solit() method divides the string at the specifed regex and returns an a
    //     String text="Java is fun programming language";
    //     //split string from space
    //     String[] result =text.split(" ");

        //public String trim()
        //public String strip()
        //public String stripLeading()
        //public String strpTrailing()
        //public boolean isBlank()
        //static String valueOf(double num)
        //static String valueOf(long num)
        //static String valueOf(Object ob)
        //static String valueOf(char chars[ ])


























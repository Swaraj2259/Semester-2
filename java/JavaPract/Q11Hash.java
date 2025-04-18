import java.util.HashSet;
import java.util.Iterator;

public class Q11Hash{
    public static void main(String[] args) 
    {
        // i. Create HashSet and add elements
        HashSet<String> hs = new HashSet<>();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        System.out.println("HashSet after adding elements: " + hs);

        // ii. Get number of elements in the HashSet
        System.out.println("Size of HashSet: " + hs.size());

        // iii. Iterate through all elements
        System.out.println("Iterating through HashSet:");
        Iterator<String> it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // iv. Add a specified element
        hs.add("abcd");
        System.out.println("HashSet after adding 'abcd': " + hs);

        // v. Remove a specified element
        hs.remove("abcd");
        System.out.println("HashSet after removing 'abcd': " + hs);
    }
}

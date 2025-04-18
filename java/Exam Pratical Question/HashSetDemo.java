// 11. WAP to create a HashSet "hs"
// i. add
// ii. get the number of elements in a hash set
// iii. to iterate through all elements in a hash set
// iv. to add the specified element in hash set
// v. to Remove the specified element from the HashSet
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
   
        HashSet<String> hs = new HashSet<>();
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Cherry");

 
        System.out.println("Size of HashSet: " + hs.size());
 
        
        System.out.println("HashSet elements:");
        for (String item : hs) {
            System.out.println(item);
        }

    
        hs.add("Mango");

 
        hs.remove("Banana");

        System.out.println("HashSet after modification: " + hs);
    }
} 
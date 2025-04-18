import java.util.HashSet;
import java.util.Set;
public class HashSetEx {
    public static void main(String[] args) {
       Set<Integer> s1 = new HashSet<>();
         s1.add(10);
         s1.add(20);
         s1.add(20);
         s1.add(30);
         s1.add(40);

        for (Integer i : s1) {
            System.out.println("Values - " + i);

        }

    }
}

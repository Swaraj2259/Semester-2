
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {

    public static void main(String[] args) {
        Set<Integer> s1 = new TreeSet<>();  //we can use comparator to change the order to descending
        //TreeSet stores the elements in assceding order by default
        // provide custom comparator to change the order

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

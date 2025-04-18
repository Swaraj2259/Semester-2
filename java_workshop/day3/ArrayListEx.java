
import java.util.ArrayList;

public class ArrayListEx {

    public static void main(String[] args) {
        ArrayList<Integer> vals = new ArrayList();
        vals.add(10);
        vals.add(11);
        vals.add(12);
        vals.add(13);
        vals.add(14);
        System.out.println(vals.get(0));

        for (Integer i : vals) {
            System.out.println("Values - " + i);

        }
    }
}


import java.util.LinkedList;

public class LinkedListEx {
public static void main(String[] args) {
    LinkedList<Integer> vals = new LinkedList<>();
    vals.add(10);
    vals.add(11);

    for(Integer v: vals){
        System.out.println("Values - " + v);
    }

}
}

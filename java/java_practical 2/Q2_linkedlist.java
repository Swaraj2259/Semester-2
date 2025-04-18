
import java.util.LinkedList;

public class Q2_linkedlist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("H");
        list.add("E");
        list.add("L");
        list.add("L");
        list.add("O");

        // Qustion no.b
        System.out.println("after removing the last element " + list.removeLast() +list);

        // Qustion no.c
        System.out.println("Last Element is " + list.peekLast());

         // Qustion no.d
        System.out.println("LinkedList elements" + list);

         // Qustion no.e
        list.clear();
        System.out.println("LinkedList after clearing: " + list);
    }
} 
import java.util.*;

public class LinkedListMethods {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");

        System.out.println("List: " + list);

        list.addFirst("OOO");
        list.addLast("ZZZ");

        System.out.println("List after adding first and last: " + list);

        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());

        list.removeFirst();
        System.out.println("After removing first: " + list);

        list.removeLast();
        System.out.println("After removing last: " + list);

        LinkedList<String> list2 = new LinkedList<String>(list);
        System.out.println("Cloned list: " + list2);
    }
}
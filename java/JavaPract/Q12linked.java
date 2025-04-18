import java.util.LinkedList;

public class Q12linked {
    public static void main(String[] args) 
    {
        // Creating LinkedList and add elements
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println("LinkedList after adding elements: " + list);

        // i. Remove last element
        list.removeLast();
        System.out.println("After removing last element: " + list);

        // ii. Retrieve but do not remove the last element
        String lastElement = list.getLast();
        System.out.println("Last element (retrieved but not removed): " + lastElement);

        // iii. Print all elements
        System.out.println("All elements in LinkedList:");
        for (String item : list) {
            System.out.println(item);
        }

        // iv. Remove all elements
        list.clear();
        System.out.println("LinkedList after removing all elements: " + list);
    }
}

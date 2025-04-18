import java.util.*;

class LinkedListDemo {
    public static void main(String args[]) {
        // Create a linked list.
        LinkedList<String> list = new LinkedList<String>();

        // Add elements to the linked list.
        list.add("F");
        list.add("B");
        list.add("D");
        list.add("E");
        list.add("C");
        list.addLast("Z");
        list.addFirst("A");

        System.out.println("Original list: " + list);

        // Remove first and last elements.
        list.removeFirst();
        list.removeLast();
        System.out.println("List after deleting first and last: " + list);

        // Get and set a value.
        String val = list.get(2);
        list.set(2, val + " Changed");
        System.out.println("List after change: " + list);

        // Add element at index 1
        list.add(1, "A2");
        System.out.println("List after adding A2 at index 1: " + list);

        // Remove elements from the linked list.
        list.remove("F"); // Remove element "F"
        list.remove(2); // Remove element at index 2
        System.out.println("List after deletion: " + list);
    }
}
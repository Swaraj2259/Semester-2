import java.util.*;

class LinkedListInteger {
    public static void main(String args[]) {
        // Create a linked list.
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements to the linked list.
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.addLast(6);
        list.addFirst(7);

        System.out.println("Original list: " + list);

        // Remove first and last elements.
        list.removeFirst();
        list.removeLast();
        System.out.println("List after deleting first and last: " + list);

        // Get and set a value.
        int val = list.get(2);
        list.set(2, val + 10);  // Corrected: Integer operation instead of String concatenation
        System.out.println("List after changing value at index 2: " + list);

        // Add element at index 1
        list.add(1, 22);
        System.out.println("List after adding 22 at index 1: " + list);

        // Remove elements from the linked list.
        list.remove(3); // Removes element at index 3
        list.remove(2); // Removes element at index 2
        System.out.println("List after deletion: " + list);
    }
}
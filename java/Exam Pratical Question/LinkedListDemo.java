// 12. WAP to implement the following methods of LinkedList:
// i. to remove last element from a linked list
// ii. to Retrieve but does not Remove, the Last Element of a LinkedList
// iii. To print all the elements of LinkedList
// iv. to remove all the elements from a linked list
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

 
        list.removeLast();

   
        System.out.println("Last Element: " + list.peekLast());

 
        System.out.println("LinkedList elements: " + list);

 
        list.clear();
        System.out.println("LinkedList after clearing: " + list);
    }
} 
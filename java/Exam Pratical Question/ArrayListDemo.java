// 10. WAP to create two ArrayLists, list1 and list2 and perform following operations:
// i. add "A", "B","C" in list1
// ii. add "D", "E", "F" in list2
// iii. add all the objects of list2 to list1 with the function call
// iv. remove "E" from list1
// v. check whether list1 is empty or not
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list1.add("A");
        list1.add("B");
        list1.add("C");

        list2.add("D");
        list2.add("E");
        list2.add("F");

        list1.addAll(list2);
        list1.remove("E");

        System.out.println("List1: " + list1);
        System.out.println("Is list1 empty? " + list1.isEmpty());
    }
} 
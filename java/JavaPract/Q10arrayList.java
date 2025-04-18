import java.util.ArrayList;
public class Q10arrayList {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        // i. Add "A", "B", "C" in list1
        list1.add("A");
        list1.add("B");
        list1.add("C");
        System.out.println("list1 after adding A, B, C: " + list1);

        // ii. Add "D", "E", "F" in list2
        list2.add("D");
        list2.add("E");
        list2.add("F");
        System.out.println("list2 after adding D, E, F: " + list2);

        // iii. Add all objects of list2 to list1
        list1.addAll(list2);
        System.out.println("list1 after adding all from list2: " + list1);

        // iv. Remove "E" from list1
        list1.remove("E");
        System.out.println("list1 after removing E: " + list1);

        // v. Check if list1 is empty
        System.out.println("Is list1 empty? " + list1.isEmpty());
    }
}



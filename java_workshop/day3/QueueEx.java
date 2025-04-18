import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<Integer> q1=new PriorityQueue<>(Comparator.reverseOrder());
        q1.add(10);
        q1.add(20);
        q1.add(9);
        q1.add(40);

        System.out.println(q1.remove());
        System.out.println(q1);
    }
}

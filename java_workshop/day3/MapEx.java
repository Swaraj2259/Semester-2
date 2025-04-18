
// import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
public class MapExample {
public static void main(String[] args) {
    Map<Integer, String> m1 = new HashMap<>();
    m1.put(1, "vjiay");
    m1.put(2,"vivek");
    m1.put(3,"harsh");
    
    m1.put(3, "harsha");
    System.out.println(m1.keySet());
    System.out.println(m1.values());
    System.out.println(m1.entrySet());

    // Iterator<Integer,String> itr = m1.entrySet().iterator();

}
}

class gen<T>{
    T ob;
     gen(T o) {
        ob = o;
    }

    // Return ob
    T getob() {
        return ob;
    }

    // Show the type of T
    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}
public class gerneric_double {
    public static void main(String args[]) {
        // gen<Double> iob;
        // iob = new gen<Double>(88.0);
        gen<Double> iob = new gen<>(88.0);

        iob.showType();
        Double v = iob.getob();
        System.out.println("Value: " + v);

        System.out.println();        
    }
}
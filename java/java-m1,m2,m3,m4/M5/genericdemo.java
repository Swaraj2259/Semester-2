// Generic class
class Gen<T> {
    T ob; // Declare an object of type T

    // Constructor to initialize object
    Gen(T o) {
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

public class genericdemo {
    public static void main(String args[]) {
        // Create a Gen reference for Integers
        Gen<Integer> iob = new Gen<>(88); // Corrected object creation

        // Show the type of data used by iob
        iob.showType();

        // Get the value in iob
        int v = iob.getob();
        System.out.println("Value: " + v);

        System.out.println();

        // Create a Gen object for Strings
        Gen<String> strob = new Gen<>("Generics Test");

        // Show the type of data used by strob
        strob.showType();

        // Get the value of strob
        String str = strob.getob();
        System.out.println("Value: " + str);
    }
}

    


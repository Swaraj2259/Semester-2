// java program to demonstrate type casting
class TypeCastingEx {
    public static void main(String[] args) {
        // implicit casting (widening)
        double d = 100.23;
        long l= (long) d; // explicit casting (narrowing)
        int i = (int) l; // explicit casting (narrowing)
        System.err.println("long value: " + l); 
        System.out.println("Implicit Casting: " + i);
        
    }
}
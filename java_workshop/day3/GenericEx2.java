public class GenericEx2 {
    public static <T,V> void getAddition(T num, V num2) {
        System.out.println("The number is: " + num);
        System.out.println("The number is: " + num2);
    }

    public static void main(String[] args) {
        getAddition(10, 10.5);
        
    }
}

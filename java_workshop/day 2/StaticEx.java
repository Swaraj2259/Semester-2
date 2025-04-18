public class StaticEx {
    static{
        System.out.println("This is a static block");
    }
    //nested classes can only be static
    static class Data{
        int d;
    }
    public static void main(String[] args) {
        System.out.println("This is a main method");
    }
}

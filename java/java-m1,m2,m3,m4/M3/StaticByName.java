class StaticDemo{
    static int a = 42;
    static int b = 99;
    static void callme(){
        System.out.println("a = " + a);
    }
}
@SuppressWarnings("unused")
class StaticByName{
    public static void main(String[] args) {
        StaticDemo.callme();
        System.out.println("b = " + StaticDemo.b);
    }
}
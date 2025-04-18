@FunctionalInterface
interface Arthimetic {
    public void execute(int a, int b);
}

public class Prac1{
    public static void main(String[] args) {
        Arthimetic a1=(n1,n2)->{
            int sum=n1+n2;
            System.out.println("Addition: "+sum);
        };
        a1.execute(10, 20);
    }
}
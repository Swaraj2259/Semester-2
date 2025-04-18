@FunctionalInterface
 interface ArithmeticOperations {
    public void addition(int num1,int num2);
}

//Lambda expressions are used to give implementation of abtstract method of function

public class Prac2{
    public static void main(String[] args) {
        ArithmeticOperations a1=(n1,n2)->{
            int a =n1+n2;
            System.out.println("addition is "+a);
        };



        a1.addition(6,5);
        a1.addition(12,12);
    }
}

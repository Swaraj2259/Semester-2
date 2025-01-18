// write a program to print multiplication table of a number
class multiplication_table  
{  
    public static void main(String[] args) {
        int num = 23;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
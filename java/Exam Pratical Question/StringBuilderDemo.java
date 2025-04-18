// 9. WAP to create an object of StringBuilder class and perform following operations:
// i. append
// ii. insert
// iii. replace
// iv. delete
// v. reverse
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");
        sb.insert(5, " Java");
        sb.replace(0, 5, "Hi");
        sb.delete(3, 7);
        sb.reverse();

        System.out.println("Final StringBuilder: " + sb);
    }
} 
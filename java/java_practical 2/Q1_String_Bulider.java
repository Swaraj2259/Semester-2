
public class Q1_String_Bulider {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" world");
        System.out.println("after appending "+sb);
        sb.insert(5, ",");
        System.out.println("after insert "+sb);
        sb.replace(5, 6,";");
        System.err.println("after replace "+ sb);
        sb.deleteCharAt(5);
        System.err.println("after delete the ';' semicolon "+ sb);
        sb.reverse();

        System.out.println("Final StringBuilder: " + sb);
    }
} 
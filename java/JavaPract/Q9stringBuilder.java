public class Q9stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");

        sb.append(" World");
        System.out.println("After append: " + sb);

        sb.insert(11, " Insert");
        System.out.println("After insert: " + sb);

        sb.replace(6, 11, "Replaced");
        System.out.println("After replace: " + sb);
        
        sb.delete(15, 20);
        System.out.println("After delete: " + sb); 

        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}

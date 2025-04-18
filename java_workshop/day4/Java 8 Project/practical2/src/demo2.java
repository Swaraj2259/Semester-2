@FunctionalInterface
interface  InterfaceEx {
    public void execute();

    /*function interface contains only 1 abstract method 
    use @FuntionalInterface annotation to declare interface at functional and 
     */

}

class demo  implements  InterfaceEx {
    public void execute()
    {
        System.out.println("inside execute");
    }
}

public class demo2 {
    public static void main(String[] args) {
        InterfaceEx e1 = () -> {
            System.out.println("inside execute");
        };
        e1.execute();
    }
}

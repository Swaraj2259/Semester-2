// package M4;

abstract class abstract_bikes {
    abstract void run();

    
}
class honda extends abstract_bikes{
    void run(){
        System.out.println("running safely");
    }


    public static void main(String[] args) {
        abstract_bikes obj = new honda();
        obj.run();
    }
}



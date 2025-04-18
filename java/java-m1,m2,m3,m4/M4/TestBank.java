// package java.M4;

abstract class bank{
    abstract void getrateofinterest();

}
class SBI extends bank{
    void getrateofinterest(){
        System.out.println("SBI rate of interest is 8%");
    }
}
class PNB extends bank{
    void getrateofinterest(){
        System.out.println("PNB rate of interest is 9%");
    }
}
class TestBank{
    public static void main(String[] args) {
        bank b;
        b = new SBI();
        b.getrateofinterest();
        b = new PNB();
        b.getrateofinterest();
    }
}
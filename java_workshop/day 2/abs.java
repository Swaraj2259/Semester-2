 class s {

}
abstract class demo{
    //abstract class can contain abstract methods and non abstract methods
    //we can't create object of abstract class
    //child class must give implementation of abstract methods of abstract class

    public abstract void getInterest();

    public void getDetails(int loanAmt){
        System.out.println("Loan Amount: "+loanAmt);
    }
}
class demo2 extends demo{
    public void getInterest(){
        System.out.println("Interest is 10%");
    }
}
public class abs {
    public static void main(String[] args) {
        demo2 d = new demo2();
        d.getInterest();
        d.getDetails(10000);
    }
}
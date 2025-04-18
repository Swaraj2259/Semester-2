public interface bank {
//interface is a blueprint of a class
// interface can only have abstract methods

    public void calculateInterest();
    public void getloan();
    public void createAccount();

    public default void getData(){
        System.out.println("This is a default method");
    }
    public static void updateData(){
        System.out.println("inside updateData");
    }
}
class sbi implements bank{
    public void calculateInterest(){
        System.out.println("Interest is 5%");
    }
    @Override
    public void getloan(){
        System.out.println("Loan is available");
    }
    @Override
    public void createAccount(){
        System.out.println("Account is created");
    }
}class ICIC implements bank{
    public void calculateInterest(){
        System.out.println("Interest is 6%");
    }
    @Override
    public void getloan(){
        System.out.println("Loan is available");
    }
    @Override
    public void createAccount(){
        System.out.println("Account is created");
    }
}
class bank{
    public static void main(String[] args) {
        sbi s = new sbi();
        s.calculateInterest();
        s.getloan();
        s.createAccount();
        ICIC i = new ICIC();
        i.calculateInterest();
        i.getloan();
        i.createAccount();
    }
}
class BankAccount{
    int accountNumber;
    int balance;
    static String bankname;
    static int interestrate; 

    public static String getBankname() {
        return bankname;
    }

    public static void setBankname(String bankname) {
        BankAccount.bankname = bankname;
    }

    public static int getInterestrate() {
        return interestrate;
    }

    public static void setInterestrate(int interestrate) {
        BankAccount.interestrate = interestrate;
    }
   

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    
}
class bankk{
    public static void main(String[] args) {
        BankAccount b1=new BankAccount();
        BankAccount.setBankname("HDFC");
        BankAccount.setInterestrate(5);
        b1.setAccountNumber(1515151);
        b1.setBalance(10000);
        System.out.println(BankAccount.getBankname());
        System.out.println(BankAccount.getInterestrate());
        System.out.println(b1.getAccountNumber());
        System.out.println(b1.getBalance());

        System.out.println("-------------------");

        BankAccount b2=new BankAccount();
        BankAccount.setBankname("Sbi");
        BankAccount.setInterestrate(10);
        b2.setAccountNumber(1511);
        b2.setBalance(1999);
        System.out.println(BankAccount.getBankname());
        System.out.println(BankAccount.getInterestrate());
        System.out.println(b2.getAccountNumber());
        System.out.println(b2.getBalance());
    }
}
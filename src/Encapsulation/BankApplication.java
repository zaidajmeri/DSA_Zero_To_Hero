package Encapsulation;


public class BankApplication {

    private long accountNumber;
    private double Balance;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return Balance;
    }

//    public void setBalance(double balance) {
//        Balance = balance;
//    }

    public void deposit(double amount){
        if(amount > 0){
            Balance += amount;
            System.out.println("Deposited: " + amount);

        }
        else {
            System.out.println("Invalid Diposit amount");
        }
    }

    public void withdraw(double amount){
    if(amount > 0 && amount <= Balance){
        Balance -= amount;
        System.out.println("Withdrew " + amount);
    }
    else{
        System.out.println("Invalid or Insufficient Balance");
    }

    }
    

}

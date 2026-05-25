package Multithreading.Locking.Intrinsic;

public class BankAcc {

    //Intrinsic also known as automatic lock
    private int balance = 100;

    public synchronized void withdraw(int amount)  {
        System.out.println(Thread.currentThread().getName() + " Attempting to Withdraw " + amount);
        if (balance>= amount){
                System.out.println(Thread.currentThread().getName() + " Proceeding withdrawl ");

                try {
                    Thread.sleep(3000);
                }
                catch (InterruptedException e)
                {
                }

                balance-= amount;
                System.out.println(Thread.currentThread().getName() + " Completed Withdrawls. Remaining Balance" + balance);
        }
        else {
            System.out.println(Thread.currentThread().getName() + " Insufficient Balance ");
        }
    }

}

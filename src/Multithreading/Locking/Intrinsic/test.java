package Multithreading.Locking.Intrinsic;

public class test {
    public static void main(String[] args){
        BankAcc bankAcc = new BankAcc();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                bankAcc.withdraw(10);
            }
        };  

        Thread t1 = new Thread(task,"Thread 1");
        Thread t2 = new Thread(task ,"Thread 2");
        t1.start();
        t2.start();
    }
}

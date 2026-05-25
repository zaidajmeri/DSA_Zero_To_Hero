package Multithreading.Locking.Explicit;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//WE ARE LEARNING LOCKS IN THIS PROGRAM
public class Explicit {
    private int balance = 100;
        //LOCK IS INTERFACE JISKA HUM INTERFACE BANAYENGE
        //LOCK IS OBJECT
        //THERE IS SOME METHOD WE'LL LEARN IN THIS PRACTICAL

    private final Lock lock = new ReentrantLock(); // this is class that implement lock
    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " Attempting to withdraw " + amount);
        try {
            //lock.lock();  //if any thread coming then it will wait until lock will not acquire
            // time lock
            if(lock.tryLock(2000, TimeUnit.MILLISECONDS)){ // time lock
                if(balance>=amount){
                    try {
                        System.out.println(Thread.currentThread().getName() + " Proceeding withdwals ");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " Completed withdrawl. Remaining balance. " + balance);
                    }
                    catch (Exception e1){
                        Thread.currentThread().interrupt();
                    }
                    finally {
                        lock.unlock(); //unlock() release the lock
                    }

                }
                else{
                    System.out.println(Thread.currentThread().getName() + " Insufficient balance ");
                }
            }
            else{
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock, will try later");
            }
        }catch (Exception e){
            Thread.currentThread().interrupt();
        }
        if(Thread.currentThread().isInterrupted()){
            System.out.println("");
        }

    }
}

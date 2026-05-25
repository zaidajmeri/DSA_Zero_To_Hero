package Multithreading.Synchronization;

public class Counter {
    private int count = 0;

   //  two types of synchronized

//    public synchronized void increment(){
//        count++
//    }

    public  void increment(){
        synchronized (this){
            count++;
        }
    }

    public int getCount(){
        return count;
    }
}

package Multithreading.Synchronization;

public class Threadss extends Thread{
    private Counter counter;

    public Threadss(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++){
            counter.increment();
        }
    }
}

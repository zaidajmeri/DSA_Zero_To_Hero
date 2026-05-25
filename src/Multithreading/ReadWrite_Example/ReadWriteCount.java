package Multithreading.ReadWrite_Example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteCount {
    private int count = 0;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

    public void increment(){
        writeLock.lock();
        try {
            count++;    
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            writeLock.unlock();
        }
    }

    public int  getCount(){
        readLock.lock();
        try {
            return count;
        }
        finally {
            readLock.unlock();
        }

    }

    public static void main(String[] args) throws InterruptedException{
        ReadWriteCount counter = new ReadWriteCount();

       // lets make two anonymouse class

        Runnable readTask = new Runnable() {
            @Override
            public void run() {
                for(int i =0; i <= 10; i++){
                    System.out.println(Thread.currentThread().getName() + " Read " + counter.getCount());
                }
            }
        };

        Runnable writeTask = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10; i++){

                    counter.increment();

                    System.out.println(Thread.currentThread().getName() + " Incremented ");
                }
            }
        };

        Thread writeThread = new Thread(writeTask);
        Thread readThread1 = new Thread(readTask);
        Thread readThread2 = new Thread(readTask);
        // in above statement 1 thread writing task but two thread only reading(watching)

        writeThread.start();
        writeThread.sleep(2000);
        readThread1.start();
        readThread1.sleep(2000);
        readThread2.start();
        readThread2.sleep(2000);

        writeThread.join();
        readThread1.join();
        readThread2.join();

        System.out.println("Final Count " + counter.getCount());

    }
}

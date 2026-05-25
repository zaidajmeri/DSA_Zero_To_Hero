package Multithreading;

import com.sun.source.tree.YieldTree;

public class yield01 extends Thread {
    //Yield method
    public yield01(String name){
        super(name);
    }

    @Override
    public void run() {  
        for (int i = 0; i < 5; i++){
        System.out.println(Thread.currentThread().getName() + " Is Running");
        Thread.yield();
        }
    }

    public static void main(String[] args) {
        yield01 y1 = new yield01("Y1");
        yield01 y2 = new yield01("y2");
        y1.start();
        y2.start();
    }
}

package Multithreading.Synchronization;

public class Test {

    public static void main(String[] args){
        Counter counter = new Counter();
        Threadss t1 = new Threadss(counter);
        Threadss t2 = new Threadss(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (Exception e){

        }
        System.out.println(counter.getCount());
    }




}

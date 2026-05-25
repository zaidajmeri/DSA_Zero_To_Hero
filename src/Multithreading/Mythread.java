package Multithreading;

public class Mythread extends Thread {
    @Override
    public void run() {
        System.out.println("Running");
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws  InterruptedException{
        Mythread t1 = new Mythread();
        System.out.println(t1.getState()); //this will print "NEW" because it is in "NEW" State

        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(100);
        System.out.println(t1.getState());

        t1.join(); //Waits for this thread to terminate.
        System.out.println(t1.getState());

    }

}

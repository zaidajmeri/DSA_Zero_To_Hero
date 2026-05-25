package Multithreading.Locking.Explicit;

public class test {
    public static void main(String[] args){
        Explicit explicit = new Explicit();
        Runnable task = new  Runnable() {
            @Override
            public void run() {
                    explicit.withdraw(50);
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        t1.start();
        t2.start();
    }
}

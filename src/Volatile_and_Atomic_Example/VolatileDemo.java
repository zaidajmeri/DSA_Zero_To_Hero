package Volatile_and_Atomic_Example;

public class VolatileDemo {
    public static void main(String[] args){
            sharedObj sharedObj = new sharedObj();
            Thread writerThread = new Thread(()->{
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
                sharedObj.setFlagTrue();
            });

            Thread readerThread = new Thread(()-> sharedObj.printFlagTrue());

            writerThread.start();
            readerThread.start();


    }

    }

class sharedObj{
    private volatile boolean flag = false;

    public void setFlagTrue(){
            System.out.println("Writer thread made the flag true");
        flag = true;
    }

    public void printFlagTrue(){
        while(!flag){

        }
        try {
            Thread.sleep(2000);

        }
        catch (Exception e){

        }
        System.out.println("Flag is True");
    }
}

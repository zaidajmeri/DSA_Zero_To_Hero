package Multithreading.ExecuterFramework;


//purpose of this program is that if we dont want to return something then we use Runnable
//In Runnable we have run() method
import java.sql.SQLOutput;

public class RunnableTask implements Runnable{
    @Override
    public void run() {
        try {

            Thread.sleep(1);
            System.out.println("Thread Sleeped");
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

    }
}

package Multithreading.ScheduledExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class main {
    public static void main(String[] args){
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        //schedule method
        scheduler.schedule(() ->
                System.out.println("Task is executed after 5 second delay"), 2, TimeUnit.SECONDS);
        scheduler.shutdown();
    }


}

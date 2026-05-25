package Multithreading.ScheduledExecutor;

import Multithreading.ExecuterFramework.Executer2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class scheduleAtFixedRate {
    public static void main(String[] args){
        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
        service.scheduleAtFixedRate( () -> System.out.println("task executer after every 5 second"), 5,5,
                TimeUnit.SECONDS);

        service.schedule(() -> {
            System.out.println("Intiating shutdown");
            service.shutdown();
        },5,TimeUnit.SECONDS);
        service.shutdown();


    }
}

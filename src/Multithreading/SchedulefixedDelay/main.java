package Multithreading.SchedulefixedDelay;

import java.sql.Time;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class main {
    public static void main(String[] args){
        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);

        ScheduledFuture<?> future = service.scheduleWithFixedDelay(() -> System.out.println("Task Executed"), 2, 2,
                TimeUnit.SECONDS);

        service.schedule( ()-> {
            System.out.println("Intiting shutdown");
                    service.shutdown();
        },20,TimeUnit.SECONDS);



    }
}

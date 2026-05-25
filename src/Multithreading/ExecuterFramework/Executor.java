package Multithreading.ExecuterFramework;

import Exception_In_Java.InvalidAgeException;

import javax.management.RuntimeMBeanException;
import java.sql.Time;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Executor {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis(); // it is standard till 1 jan 1970
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for(int i=1; i <= 10; i++){
            int finalI = i;
            executorService.submit( () -> {
                long res = fact(finalI);
                System.out.println(res);
            });

        }

        executorService.shutdown();

        try {
            executorService.awaitTermination(100, TimeUnit.SECONDS);
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("Total time : " + (System.currentTimeMillis() - startTime));
    }


    private static long fact(int n) {

        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
         throw  new    RuntimeException(e);
          }
        long result = 1;
        for(int i =1; i<=n;i++){
            result *= i;
        }
        return result;
    }
}

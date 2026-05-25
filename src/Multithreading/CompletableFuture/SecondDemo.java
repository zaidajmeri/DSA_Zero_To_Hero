package Multithreading.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class SecondDemo {
    //in this demo we will create 2 competeble future

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> task1 = CompletableFuture.supplyAsync(()->{
           try {
               Thread.sleep(2000);
               System.out.println("Worker  1");

           }catch (Exception e){

           }


            return "OK";
        });

        CompletableFuture<String> task2 = CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(2000);
                System.out.println("Worker - 2");

            }catch (Exception e){

            }

            return "OK";
        }) ;

       CompletableFuture<Void> f= CompletableFuture.allOf(task1, task2);


        f.join();
        f.get();  // in this we have to add exception
        System.out.println("main");
    }

}

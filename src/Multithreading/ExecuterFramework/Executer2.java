package Multithreading.ExecuterFramework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Executer2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<?> future = executorService.submit(() -> "Hello"                                                 );
        if(future.isDone()){
            System.out.println("Task is Done");

        }
        System.out.println(future.get());
        executorService.shutdown();
    }
}

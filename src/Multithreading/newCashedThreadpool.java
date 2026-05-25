package Multithreading;

import Multithreading.ExecuterFramework.Executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class newCashedThreadpool {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i = 0; i < 100; i++){
            int taskID = i;
            executorService.submit(() -> {
                System.out.println("Task " + taskID + "Executed by" + Thread.currentThread().getName());

            try {
                Thread.sleep(2000);
            }
catch (Exception e){

}
            });
        }
    }
}

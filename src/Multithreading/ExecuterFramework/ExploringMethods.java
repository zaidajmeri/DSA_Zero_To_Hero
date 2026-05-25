package Multithreading.ExecuterFramework;

import javax.swing.plaf.FontUIResource;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExploringMethods {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<?> future = executorService.submit( ()-> "Hello");
        future.isDone();
        System.out.println("Task Completed");
        System.out.println("Task close now");




        }
    }


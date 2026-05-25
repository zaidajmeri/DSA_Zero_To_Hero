package Multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class invokeAll {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Callable callable = () -> {
            System.out.println("Taks 1");
            return 1;
        };
        Callable callable2 = () -> {
            System.out.println("Task 2");
            return 2;
        };

        Callable callable3 = () -> {
            System.out.println("Taks 3");
            return 3;
        };


        List<Callable<Integer>> list = Arrays.asList(callable, callable2, callable3);

        List<Future<Integer>> futures = executorService.invokeAll(list);
        executorService.shutdown();
        System.out.println("This will print after all the state");


    }
}

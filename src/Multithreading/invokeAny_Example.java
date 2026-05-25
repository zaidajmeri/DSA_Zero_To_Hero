package Multithreading;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class invokeAny_Example {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Callable callable1 = () -> {
            System.out.println("Task1");
            return 1;
        };

        Callable callable2 = () -> {
            System.out.println("Task2");
            return 2;
        };

        Callable callable3 = () -> {
            System.out.println("Task3");
            return 3;
        };
        List<Callable<Integer>> list = Arrays.asList(callable1, callable2, callable3);

        Integer i = executorService.invokeAny(list); //it takes Integer Directly
        System.out.println(i);

        executorService.shutdown();

        System.out.println("Hello World");


    }
}

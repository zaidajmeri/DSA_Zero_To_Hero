package Multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class InvokeAll_Ex2 {
    public static void main(String[] args) throws InterruptedException{
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        //create a set of tasks
        Callable callable1 = () -> {
            System.out.println("Task 1");
            return 1;
        };

        Callable callable2 = ()->{
            System.out.println("Task 2");
            return 2;
        };

        Callable callable3 = () ->{
            System.out.println("Task 3");
            return 3;
        };

        List<Callable<Integer>> list = Arrays.asList(callable1,callable2,callable3 );

        try{
            List<Future<Integer>> futures = executorService.invokeAll(list);
        } finally {
            executorService.shutdown();
        }

        System.out.println("Final Print");

    }
}

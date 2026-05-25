package Multithreading.ExecuterFramework;

import java.util.concurrent.Callable;

//purpose : When we need to get return something we use callable
//It Implements "Callable"
//In Callable we have call() method
//In Callable signature throws exception while in runnable we have to declare try catch

public class CallableTask implements Callable {
    @Override
    public Object call() throws Exception {
        Thread.sleep(1);
        return 1;
    }
}

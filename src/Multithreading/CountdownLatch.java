//package Multithreading;
//
//import Multithreading.ExecuterFramework.Executer2;
//
//import java.util.concurrent.Callable;
//import java.util.concurrent.CountDownLatch;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//public class CountdownLatch{
//    public static void main(String[] args) throws InterruptedException {
//        int numOfService = 3;
//
//        ExecutorService service = Executors.newFixedThreadPool(numOfService);
//
//        CountDownLatch latch = new CountDownLatch(numOfService);
//
//        service.submit(new DependentService(latch));
//        service.submit(new DependentService(latch));
//        service.submit(new DependentService(latch));
//        latch.await();
//
//        System.out.println("Main");
//        service.shutdown();
//
//
//
//    }
//}
//
//class DependentService implements Callable<String>{
//    private final CountDownLatch latch;
//
//    public DependentService(CountDownLatch latch){
//        this.latch = latch;
//    }
//
//
//    @Override
//    public String call() throws Exception {
//        try {
//            System.out.println(Thread.currentThread().getName() + "service started");
//            Thread.sleep(2000);
//        }
//        finally {
//        latch.countDown();
//        }
//        return "ok";
//
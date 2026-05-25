package Multithreading.ThreadCommunication;

import java.beans.IntrospectionException;
import java.util.function.Consumer;

class shareResource {
    private int data;
    private boolean hasData;

    //creating method that produce thread
    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
            data = value;
            hasData = true;
            System.out.println(" Produced " + value);
            notify();
        }


    public synchronized int consume() {
        while (!hasData) {
            try {
                wait();

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

            hasData = false;
            System.out.println("Comsumed" + data);
            notify();
            return data;

        }
    }
        class producer implements Runnable {
            private shareResource shareResource;

            public producer(shareResource shareResource) {
                this.shareResource = shareResource;
            }

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    shareResource.produce(i);
                }
            }
        }

        class consumer implements Runnable {
            private shareResource shareResource;

            public consumer(shareResource shareResource) {
                this.shareResource = shareResource;
            }

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    int value = shareResource.consume();
                }
            }
        }




public class ThreadCommunication {
    public static void main(String[] args) {
        shareResource shareResource = new shareResource();
        Thread produceThread = new Thread(new producer(shareResource));
        Thread consumerThread = new Thread(new consumer(shareResource));

        produceThread.start();
        consumerThread.start();
    }

}
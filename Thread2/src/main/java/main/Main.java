/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Acer
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService s = Executors.newSingleThreadExecutor();
        
        for (int i = 0; i < 10; i++) {
            ScheduledExecutorService service = Executors.newScheduledThreadPool(5);
            service.schedule(new MyThread(2), 3, TimeUnit.SECONDS);
            service.schedule(new MyThread(2), 3, TimeUnit.SECONDS);
            service.shutdown();
            service.awaitTermination(7, TimeUnit.SECONDS);
            System.out.println("Terminated");
        }

    }

//    ExecutorService service = new ThreadPoolExecutor(10, 15, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(20));
//        ExecutorService service1 = Executors.newCachedThreadPool(Executors.defaultThreadFactory());
//ExecutorService newww = Executors.newFixedThreadPool(5);
//        for (int i = 0; i < 10; i++) {
//            newww.submit(new MyThread(i));
//        }
    private static void SingleThreadExecutormethod() {
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.submit(new MyThread(1));
        service.submit(new MyThread(2));
        service.submit(new MyThread(3));
        service.submit(new MyThread(4));
        service.submit(new MyThread(5));
        service.submit(new MyThread(6));
    }

}
//     Thread t=new Thread(new MyThread());
//        Thread t1=new Thread(new MyThread());
//        t.start();
//        t.join();
//        t1.start();
//        t1.join();

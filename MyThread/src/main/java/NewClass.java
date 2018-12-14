/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class NewClass {
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads=new Thread[1000];
        
        for (int i = 0; i < 10; i++) {
             threads[i]=new Thread(new MyConsumer());
            threads[i].start();
        }
      
          Thread d=new Thread(new MyProducer());
          d.start();  
          int activeCount = Thread.activeCount();
        System.out.println("count="+activeCount);
          Thread.sleep(5000);
          System.out.println("son netice="+Base.a);
        
    }
    
}

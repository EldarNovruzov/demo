
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class MyConsumer implements Runnable {

    @Override
    public void run() {
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
         
        }
        for (int i = 0; i < 10; i++) {
            Base.incA();
        }
        
    }

}

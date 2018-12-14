/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class MyProducer implements Runnable {

    private String name;

    public MyProducer(String a) {
        this.name = a;
    }
    public MyProducer(){
        
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
              System.out.println("result=" + Base.a);
        
        }
           
    }

}

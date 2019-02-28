/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.concurrent.Callable;

/**
 *
 * @author Acer
 */
public class MyThread implements Runnable{

    private int index;
    public MyThread(int i){
        this.index=i;
    }
    @Override
    public void run() {
        System.out.println(index+"thread ise basladi ve 3 saniye gozleyecek");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Thread isini bitirdi");
    }


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Acer
 */
public class NewClass {
    public static void main(String[] args) {
        NewClass instance = instance("dd");
        System.out.println(instance.getName());
        
    }
    
    private String name;
    private static NewClass df=null;
    private NewClass(String name){
        this.name=name;
    }
    public static NewClass instance(String name){
        if (df==null) {
            return  new NewClass(name);
        }
        return null;
     
    }
    public String getName() {
        return name;
    }

    
}

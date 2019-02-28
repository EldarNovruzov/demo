/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 *
 * @author Acer
 */
public class Reflection {
    public static void main(String[] args) {
        BMW rr=new BMW();
        method(rr);
        
    }
    public static void method(Object obj) {
        Method[] methods=obj.getClass().getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            Method d = methods[i];
            Annotation[] f = d.getAnnotations();
            String name = methods[i].getName();
            System.out.println(name);
        }
    }
    
}

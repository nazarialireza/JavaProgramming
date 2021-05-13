/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.Methods;

/**
 *
 * @author my
 */
public class JM15 {
    
    static void myMethod(String x){
        System.out.println(x);
    }
    static int myMethod(int x){
        return x;
    }
    static float myMethod(float x){
        return x;
    }
    static double myMethod(double x, double y){
        return x + y;
    }
            
            
    public static void main(String[] args) {
       myMethod("Java");
       int num = myMethod(100);
       System.out.println(num);
       float f = myMethod(55.8f);
       System.out.println(f);
       double d = myMethod(33.4, 45.9);
       System.out.println(d);
    }
    
}

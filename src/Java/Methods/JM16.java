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
public class JM16 {
    static int a;
    
    
    public static void main(String[] args) {
        setA();
        System.out.println(getA());
    }
    
    static int getA(){
        return a;
    }
    static void setA(){
        a = 100;
    }
    
    
}

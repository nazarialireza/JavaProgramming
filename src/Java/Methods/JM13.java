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
public class JM13 {

    static void myMethod() {
        System.out.println("I just got executed!");
    }
    
    static int myNum(){
        int a = 10;
        int b = 5;
        int c = a + b + 5;
        return c;
    }
    
    static char myChar(){
        return 'A';
    }
    
    static boolean myBoolean(){
        return true;
    }
    
    public static void main(String[] args) {
        // call a void method
        myMethod();
        
        // call a int method
        int num = myNum();
        System.out.println(num);
        
        
       // call a char method
       char c = myChar();
       System.out.println(c);
       
       // call a boolean method
       boolean b = myBoolean();
       System.out.println(b);
    }
    
}

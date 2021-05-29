/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.Classes;

/**
 *
 * @author my
 */
public class JC22 {                 // public class
                                    // public static method
    public static void main(String[] args) {
        
    
    }
}

class Cars{                         // deafult class
    JC22 a;
    private transient String key;   // transient attribute
    volatile int y,x;               // volatile attribute
    public int c, b;                // public global attribute
    
    synchronized void location(){}  // synchronized method
    
    public void color(){}           // public method
    void model(){}                  // defult method
    final void speed(){}            // final method
    protected void type(){}         // protected method
    private void name(){}           // private method
}
// the class connot be inherited by other classes
final class Vehicle{}               // final class

// the class connot be used to create objects
abstract class Student{             // abstract class 
    public abstract void study();   // abstract method
}
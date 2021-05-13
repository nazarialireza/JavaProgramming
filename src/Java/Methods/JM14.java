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
public class JM14 {
//    static void myMethod() {
//        System.out.println("I just got executed!");
//    }
//    static void myMethod(String fname, int age) {
//        System.out.println(fname + " is " + age);
//    }
    
    static void print(int num) {
        System.out.println(num);
    }
    
    static int sumOfTwoInt(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
//       myMethod("Hamid", 20);
//       myMethod("Wahid", 24);
//       myMethod("Samim", 18);

        print(sumOfTwoInt(3, 56));
        
    }
    
}

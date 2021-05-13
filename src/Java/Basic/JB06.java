/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.Basic;

/**
 *
 * @author my
 */
public class JB06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println(Math.max(5, 10)); 
//        System.out.println(Math.min(5, 10));
//        System.out.println(Math.sqrt(64));
//        System.out.println(Math.abs(-4.7));
//        System.out.println(Math.random());
//        int randomNum = (int)(Math.random() * 101);  // 0 to 100
//        System.out.println(randomNum);

        int age_b = 18;
        int age_a = 23;
        if(Math.min(age_b, age_a) < 20 ){
            System.out.println("Your age is under 20 years!");
        }else{
            System.out.println("Your age is more than 20 years!");
        }
    }
    
}

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
public class JB08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int expression = 10;
//        if( a == 8){
//            // task 1
//        }
//        if( a == 9){
//            // task 2
//        }
//        if( a == 10){
//            // tesk 3
//        }

        int day = 3;
        switch (day) {
          case 1:case 2:case 3:case 4:case 5:
            System.out.println("Friday");
            break;
          case 6:
            System.out.println("Saturday");
            break;
          case 7:
            System.out.println("Sunday");
            break;
        }
    }
    
}

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
public class JB11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            if (i == 4) {
//              continue; // break 
//            }
//            System.out.println(i);
//        }

        int i = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
          
        }
    }
    
}

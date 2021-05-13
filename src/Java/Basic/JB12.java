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
public class JB12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // int
//        int num = 10, num2 = 23, num3 = 39, num4 = 40;
        
        // arrays ints
//        int[] nums;
        //    indexs    0   1   2   3
//        int[] myNum = {10, 20, 30, 40};
//        char[] chars = {'A', '0', 'K', '1'};
        
//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        for(int i = 0 ; i < cars.length ; i++) 
//            System.out.println(cars[i]);
//        
//        System.out.println("\n");
//        
//        for(String i : cars)
//            System.out.println(i);
//        
//        System.out.println("\n");
//        
//        int j = 0;
//        while(j < cars.length){
//            System.out.println(cars[j]);
//            j++;
//        }

        int[][] myNumbers = { 
            {1, 2, 3, 4}, // index 0
            {5, 6, 7} // index 1
        //   0  1  2
        };
        
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
        
    }
    
}

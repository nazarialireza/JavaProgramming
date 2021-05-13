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
public class JB10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        for(int i = 0; i < 50 ; i += 10){
//            System.out.println(i);
//        }
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        
        // for each item in list
        for (String i : cars) {
            System.out.println(i);
        }
        
        for(int index = 0; index < cars.length ; index++){
            System.out.println(cars[index]);
        }
    }
    
}

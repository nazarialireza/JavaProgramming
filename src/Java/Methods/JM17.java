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
public class JM17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0;
//        int result = sum(100);
        int input = 100;
        int result = 0;
        for (int i = 0 ; i <= input ; i++){
            result += i; // result = result + i;
        }

        System.out.println(result);
    }   
    public static int sum(int k) {
        if (k > 0) {
          return k + sum(k - 1);
        } else {
          return 0;
        }
    }
}
//10 + sum(9)
//10 + ( 9 + sum(8) )
//10 + ( 9 + ( 8 + sum(7) ) )
//...
//10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
//10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0

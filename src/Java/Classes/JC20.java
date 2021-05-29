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
public class JC20 {
    public static void main(String[] args) {
        
        Math salary = new Math();
        salary.a = 1000;
        salary.b = 2000;
        salary.sum("Joushova"); // x init (a + b)
        System.out.println(salary.name + " " + salary.x + "$ Salary");
        
        Math salary2 = new Math();
        salary2.a = 4000;
        salary2.b = 4000;
        salary2.sum("Hamid"); // x init (a + b)
        System.out.println(salary2.name + " " + salary2.x + "$ Salary");
    
    }
}
class Math{
    int a, b, x;
    String name;
    
    public void sum(String arg){
        name = arg;
        x = a + b;
    }
}

// a + b = x
// a - b = x
// a \ b = x
// a * b = x
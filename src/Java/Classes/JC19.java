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
public class JC19 {
    public static void main(String[] args) {
        Car MyCar = new Car();
        MyCar.name = "BMW";
        
        Car MyFCar = new Car();
        MyFCar.name = "Volvo";
        
        System.out.println(MyCar.name + " " + MyFCar.name);
    }
}

class Car{
    String name;
}

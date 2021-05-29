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
public class JC23 {
    public static void main(String[] args) {
        Vehicles allVehicles = new Vehicles();
        allVehicles.honk();
        
        ford myFord = new ford();
        myFord.honk();
    }
}
final class Vehicles {// <--------
//class Vehicles {
  protected String brand = "Cards";
  public void honk() {
    System.out.println("Tuut, tuut!");
  }
}
// error is here you cant extends final class 
// you need to remove final word from Vehicles class 
class ford extends Vehicles{ 
    public void honk() {
        System.out.println("Dagoooo , Dooogggggg!");
    }
} 



















// 03
//staff emp = new staff();
//emp.doWorking();
//
//gard g = new gard();
//g.doWorking();
// 03
//abstract class user {
//  public String fname = "John";
//  public int age = 24;
//  public int hearingYear = 2018;
//  public abstract void doWorking(); // abstract method
//}
//// Subclass (inherit from user)
//class staff extends user {
//  public void doWorking() { // the body of the abstract method is provided here
//    System.out.println("office working!");
//  }
//}
//
//// Subclass (inherit from user)
//class gard extends user {
//  public void doWorking() { // the body of the abstract method is provided here
//    System.out.println("garding area!");
//  }
//}
















// 02
//Mathing myMath = new Mathing();
//myMath.x = 20;
//System.out.println(myMath.x * myMath.PI);
// 02
//class Mathing{
//    int x = 10;
//    final double PI = 3.14;
//}












// 01
//        Cars2 myCar = new Cars2("BMW");
//        System.out.println(myCar.getName());


// 01
//class Cars2{                         // deafult class
//    private String name;
//    
//    public Cars2(String arg){
//        this.setName(arg);
//    }
//    
//    private void setName(String arg){
//        this.name = arg;
//    }
//    
//    protected String getName(){
//        return name;
//    }
//}
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
public class JC21 {
    public static void main(String[] args) {
//        FullMath s = new FullMath("ALireza");
//        s.a = 1000;
//        s.b = 2000;
//        s.sum();
//        System.out.println(s.name + " " + s.x + "$ salary");

//        FullMath.a = 1000;
//        FullMath.b = 2000;
//        FullMath.name = "Alireza";
//        FullMath.sum();
//        System.out.println(FullMath.name + " " + FullMath.x + "$ salary");

        FullMath s1 = new FullMath("Alireza", 1000, 2000);
        s1.sum();
        System.out.println(s1.name + " " + s1.x + "$ salary");
        
        FullMath s2 = new FullMath("Mohammad Jalil", 4000, 2000);
        s2.sum();
        System.out.println(s2.name + " " + s2.x + "$ salary");

    }
}
class FullMath{
    int a, b, x;
    String name;
    //static int a, b, x;
    //static String name;
    
    public FullMath(String arg){this.name = arg;}
    public FullMath(String arg, int a, int b){
        this.name = arg;
        this.a = a;
        this.b = b;
    }
    
    public void sum(){ x = a + b; }
    // public static void sum(){ x = a + b; }
}

// a + b = x
// a - b = x
// a \ b = x
// a * b = x
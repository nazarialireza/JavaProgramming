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
public class JC25 {
    private final static int noOfThreads = 10;
    
    
    public static void main(String args[]) throws InterruptedException {
        VData volatileData = new VData();               //object of VolatileData class  
        Thread[] threads = new Thread[noOfThreads];     //creating Thread array   
        for(int i = 0; i < noOfThreads; ++i)  
            threads[i] = new VThread(volatileData);  
        for(int i = 0; i < noOfThreads; ++i)  
            threads[i].start();                         //starts all reader threads  
        for(int i = 0; i < noOfThreads; ++i)  
            threads[i].join();                          //wait for all threads  
    }
}

class VData{  
    private volatile int counter = 0;   
    public int getCounter(){  
        return counter;  
    }  
    public void increaseCounter(){  
        ++counter;                  //increases the value of counter by 1   
    }  
}

class VThread extends Thread{  
    private final VData data;  
    public VThread(VData data){  
        this.data = data;         
    }  
    @Override  
    public void run(){  
        int oldValue = data.getCounter();  
        System.out.println("[Thread " + Thread.currentThread().getId() + "]: Old value = " + oldValue);  
        data.increaseCounter();  
        int newValue = data.getCounter();  
        System.out.println("[Thread " + Thread.currentThread().getId() + "]: New value = " + newValue);  
    }  
} 

//Synchronization Keyword
//Synchronized keyword modifies code blocks and methods.
//Threads can be blocked for waiting in case of synchronized.
//It synchronizes the value of all variables between thread memory and main memory.
//Synchronize is subject to compiler optimization.


//Volatile Keyword                            
//Volatile keyword is a field modifier.       
//The thread cannot be blocked for waiting in case of volatile.	
//It improves thread performance.	Synchronized methods degrade the thread performance.
//It synchronizes the value of one variable at a time between thread memory and main memory.	
//Volatile fields are not subject to compiler optimization.	
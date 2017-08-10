/**
 * Created by Sarita Singhal
 */
package com.mazicss.threading;

/**
 * @author ssinghal
 *
 */
public class ConcurrentMethodFail {
  
  
  //To make a variable thread safe
  
  public static volatile int counter = 1;
  
  public void updateCounter(){
    
    counter = counter+5;
    counter = counter-5;
    
    //counter val should be 0 after this.
  }
  
  
  public static void main(String[] arge)
  {
    
    final ConcurrentMethodFail fc = new ConcurrentMethodFail();
    
  while(true)
    {
     new Thread()
     {
       public void run()
       {
         try {
          sleep(1000);
        } catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
         fc.updateCounter();
       }
     }.start();
     
     System.out.println("Counter Value is "+ counter);
    }
    
  }

}

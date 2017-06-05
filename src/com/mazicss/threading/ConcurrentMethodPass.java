/**
 * Created by Sarita Singhal
 */
package com.mazicss.threading;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author ssinghal
 *
 */
public class ConcurrentMethodPass {
  
  
  public static AtomicInteger  counter = new AtomicInteger(0);
  
  public void updateCounter()
  {
   counter.addAndGet(5);
   counter.addAndGet(-5);
  }
  
  
  public static void main(String[] args)
  {
    
    ConcurrentMethodPass pc = new ConcurrentMethodPass();
    for (int j=0; j<1000; j++)
    {
    
   for(int i= 0;i<1000; i++)
    {
      new Thread(){
        public void run()
        {
          pc.updateCounter();
          try {
            sleep(1000);
          } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        }
      }.start();
      
      System.out.println(counter);
    }
    }
    
  }
  
  

}

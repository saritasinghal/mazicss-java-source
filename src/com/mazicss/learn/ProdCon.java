/**
 * Created by Sarita Singhal
 */
package com.mazicss.learn;

import java.util.LinkedList;

/**
 * @author ssinghal
 *
 */
public class ProdCon extends Thread {
  
  
  
  
  public static void main(String[] arg)
  {
    
    LinkedList<Integer> lst = new LinkedList();      
 Thread t1 = new Prod(lst);
 Thread t2 = new Thread(new Cons(lst));
 
 t1.start();
 t2.start();
 
  }
  
  

}


class Prod extends Thread {
  LinkedList<Integer> l1 = new LinkedList();
  
  Prod(LinkedList l1)
  {
    this.l1 = l1;
  }
  
  public void run()
  {
    int i = 1;
   while(true)
   {
      synchronized(l1)
      {
        if(l1.size() == 5)
        {
          System.out.println("Waiting for Counsumer to Consume");
          try {
            l1.wait();
          } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
          
        }
        
        l1.add(i);
        l1.notifyAll();
        
      }
      i++;
      
    }
   
  }
  
}


class Cons implements Runnable{
  
  LinkedList<Integer> l1 = new LinkedList();
  
  Cons(LinkedList l1)
  {
    this.l1 = l1;
  }
  
  public void run()
  {
    while(true)
    {
      synchronized(l1)
      {
        if(l1.size() <= 0)
        {
          System.out.println("Waiting for Producer to Add");
          try {
           l1.wait();
          } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
          
        }
        System.out.println("Consumed  :: "+l1.remove());
        l1.notify();
        
      }
      
    }
   
  }
  
}


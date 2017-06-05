package com.mazicss.threading;

public class ThreadTest extends Thread{
  
  
 public void run()
  {
    for(int i =0; i<=10;i++)
    {
      System.out.println(" Print : "+i +"  name "+currentThread().getName());
     try{
        sleep(1000);
     }
     catch(Exception e)
     {
       System.out.println("Error :: "+e);
     }
    }
  }
  
  public static void main(String[] args)
  {
    ThreadTest t1 = new ThreadTest();
    ThreadTest t2 = new ThreadTest();
    t1.setName("T1 ");
    t2.setName("T2 ");
    t1.start();
    t2.start();
  }

}

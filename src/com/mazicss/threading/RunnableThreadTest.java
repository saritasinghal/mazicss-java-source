package com.mazicss.threading;

public class RunnableThreadTest implements Runnable{
  
  public void run()
  {
    System.out.println("Thread Started ");
  }
  
  
  public static void main(String[] args)
  {
    RunnableThreadTest rnt = new RunnableThreadTest();
    Thread t1 = new Thread(rnt,"Thread 1");
    t1.start();
  }

}

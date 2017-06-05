package com.mazicss.learn;


public  class ExceptionHandling {
  
  public static void m1()
  {
 //   int a = 10/0;
   throw new ArithmeticException("Give error");
  }

 public static void m2() throws ArithmeticException
 {
    int a = 10/0;
 }
 
 
 public static void main(String args[])
 {
 
   try{
  m1();
  // m2();
   }
   catch(ArithmeticException e)
   {
     System.out.println("Erorr " + e.toString());
   }
 }
 
  
}

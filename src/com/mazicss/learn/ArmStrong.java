package com.mazicss.learn;

/**
 * 371 is an Armstrong number since 3^3 + 7^3 + 1^3 = 371.
 * 
 * 
 *
 */

public class ArmStrong {
  
  public static void main(String[] arge)
  {
    
    int n, r, temp, sum =0 ;
    try{
    if(arge.length == 0 || arge.length > 1)
    {
      System.out.println("Please enter one and only one Arg");
    }
  int len = arge[0].length();
    n= Integer.parseInt(arge[0]);
    temp = n;
  while (temp != 0)
  {
    r= temp % 10;
    int mul = 1;
    for (int i=0;i<len;i++)
    {
      mul = mul*r;
    }
    sum = sum + mul;
    temp = n/10;
  }
    
    System.out.println(" Sum is "+ sum);
  }
  catch(Exception e)
  {
    System.out.println("Error Occured ");
  }
  }

}

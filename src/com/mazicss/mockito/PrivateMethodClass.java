/**
 * Created by Sarita Singhal
 */
package com.mazicss.mockito;

/**
 * @author ssinghal
 *
 */
public class PrivateMethodClass {
	
  String name ;
  int id ;
  
  
  public int getID()
  {
	  return 1;
  }
	
	private boolean testClass1()
	{
		boolean flag = true;
		
		System.out.println("Changeing Flag Value");
		flag = false;
		
		return flag;
	}

}

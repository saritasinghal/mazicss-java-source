/**
 * Created by Sarita Singhal
 */
package com.mazicss.mockito;

/**
 * @author ssinghal
 *
 */
public class PrivateMethodClass {
	

	
	private boolean testClass1()
	{
		boolean flag = true;
		
		System.out.println("Changeing Flag Value");
		flag = false;
		
		return flag;
	}

}

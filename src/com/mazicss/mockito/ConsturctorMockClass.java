/**
 * Created by Sarita Singhal
 */
package com.mazicss.mockito;

import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;

/**
 * @author ssinghal
 *
 */
public class ConsturctorMockClass{
	
	public int getID()
	{
		PrivateMethodClass privateMethodClass = new PrivateMethodClass();
		
	  int id = privateMethodClass.getID();
	  
	  return id+2;
	}
	
	
		
	

}

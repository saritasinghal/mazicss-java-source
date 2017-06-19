package com.mazicss.mockito;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.mazicss.mockito.PrivateMethodClass;



/*
 * ssighal
 * This class will show you how to test private method using Reflection.
 * 
 */

public class TestPrivateMethodClass {
	
	public PrivateMethodClass pvr;
	
	@BeforeClass
	void setup()
	{
		pvr = new PrivateMethodClass();
	}
	
  @Test
  public void f() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	
		  Method privateMethod;
			privateMethod = PrivateMethodClass.class.getDeclaredMethod("testClass1", null);
			privateMethod.setAccessible(true);
			boolean returnValue = (boolean) privateMethod.invoke(pvr, null);
			System.out.println("returnValue = " + returnValue);
		
	 
	  
 }
	  
	  
  }
  
  
  

/**
 * Created by Sarita Singhal
 */
package com.mazicss.mockito;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;

import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareEverythingForTest;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.IObjectFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.ObjectFactory;
import org.testng.annotations.Test;




/**
 * @author ssinghal
 *
 */

//@PrepareEverythingForTest
@PrepareForTest({ConsturctorMockClass.class})
public class TestConstructorMockClassTestNG// extends PowerMockTestCase
{
	

	@ObjectFactory
	public IObjectFactory getObjectFactory() {
	    return new org.powermock.modules.testng.PowerMockObjectFactory();
	}
	
	
//	@Rule
//	public PowerMockRule rule = new PowerMockRule();
	
	ConsturctorMockClass cntr;
	
	 PrivateMethodClass priv ;
	//PrivateMethodClass priv;
	
	
	
	@Test
	public void testPrintMethod() throws Exception
	{
		priv = mock(PrivateMethodClass.class);		
		PowerMockito.whenNew(PrivateMethodClass.class).withNoArguments().thenReturn(priv);
		when(priv.getID()).thenReturn(2);	
		cntr = new ConsturctorMockClass();		
		int id = cntr.getID();		
		assertEquals(4,id);
	}

}

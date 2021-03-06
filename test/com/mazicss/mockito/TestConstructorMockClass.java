/**
 * Created by Sarita Singhal
 */
package com.mazicss.mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.IObjectFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.ObjectFactory;
import org.testng.annotations.Test;


/**
 * @author ssinghal
 *
 */

@PrepareForTest({ConsturctorMockClass.class})
public class TestConstructorMockClass  extends PowerMockTestCase{
	
	@ObjectFactory
	public IObjectFactory getObjectFactory() {
	    return new org.powermock.modules.testng.PowerMockObjectFactory();
	}
	
	@InjectMocks
	ConsturctorMockClass cntr;
	
	@Mock
	PrivateMethodClass priv;
	
	@BeforeClass
	public void setup()
	{
		MockitoAnnotations.initMocks(this); 
	}
	
	@Test
	public void testPrintMethod() throws Exception
	{
		priv = mock(PrivateMethodClass.class);
		PowerMockito.whenNew(PrivateMethodClass.class).withNoArguments().thenReturn(priv);
		when(priv.getID()).thenReturn(2);	
	//	cntr = new ConsturctorMockClass();		
		int id = cntr.getID();		
		assertEquals(4,id);
	}

}

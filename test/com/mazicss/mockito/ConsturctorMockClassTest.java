/**
 * Created by Sarita Singhal
 */
package com.mazicss.mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;
import org.powermock.modules.junit4.PowerMockRunner;


/**
 * @author ssinghal
 *
 */

@RunWith(PowerMockRunner.class)
@PrepareForTest({ConsturctorMockClass.class})
public class ConsturctorMockClassTest  extends PowerMockTestCase{	
	
	@InjectMocks
	ConsturctorMockClass cntr;
	
	@Mock
	PrivateMethodClass priv;
	
	@Before
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

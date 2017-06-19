/**
 * Created by Sarita Singhal
 */
package com.mazicss.learn;

/**
 * @author ssinghal
 *
 */
public class NonRepeatChar {
	
	public static void main(String[] args)
	{
		String name = "Sarita Singhal";
		
		//first non repeated char in name
		
		StringBuffer buf = new StringBuffer(name);
	
		char val = 0 ;
		int len =0;
		while(len < buf.length())
		{
			if(name.substring(len+1).indexOf(buf.charAt(len)) == -1)
			{
				val = buf.charAt(len);
				break;
			}
			len= len+1;
		}
		
		System.out.println("charecter is " + val);
		
	}

}

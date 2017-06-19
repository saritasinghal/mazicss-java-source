/**
 * Created by Sarita Singhal
 */
package com.mazicss.learn;

/**
 * @author ssinghal
 *
 */

//nitin = true
public class PalindromString {

	public static void main(String args[])
	{
		
		String name = new String("nitina");
		StringBuilder newname = new StringBuilder(name);
		
		String rname = newname.reverse().toString();
		
	if(name.equals(rname))
			{
		System.out.println("Yes " + newname);
			}
	else
		System.out.println(" No " + newname);
		
	
	}
	
}

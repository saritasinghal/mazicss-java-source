/**
 * Created by Sarita Singhal
 */
package com.mazicss.learn;

/**
 * @author ssinghal
 *
 */

//this is javatpoint = siht si tnioptavaj
public class ReverseWords {
	
	public static void main(String args[])
	
	{
		String str = "this is javatpoint";
		
		String newStr[] = str.split(" "); 
		String reversedStr ="";
		
		for(String word: newStr)
		{
			String sub1 = word.substring(0, 1);
			String sub2 = word.substring(1);
			String capt = sub1.toUpperCase()+sub2;
			StringBuilder sb = new StringBuilder(capt);			
			reversedStr+= sb.reverse().toString()+" ";
		}
		
		System.out.println(reversedStr);
	}

}

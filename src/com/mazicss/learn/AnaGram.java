/**
 * Created by Sarita Singhal
 */
package com.mazicss.learn;

import java.util.Arrays;

/**
 * @author ssinghal
 *
 */

//Two strings are called anagrams if they contain same set of characters but in different order.

//"keep ? peek", "Mother In Law - Hitler Woman".

public class AnaGram {
	
	public static void main(String args[])
	{
		String str1= "Mother In Lap";
		String str2="Hitler Woman";
		
		String str1_new = str1.replaceAll("\\s", "");
		String str2_new = str2.replaceAll("\\s", "");
		
		
		
		boolean flag = true;
		char c1[]= str1_new.toLowerCase().toCharArray();
		char c2[]= str2_new.toLowerCase().toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(str1_new.length() == str2_new.length())
		{
		flag = Arrays.equals(c1, c2);
		}
		else
			flag = false;
		
		System.out.println("Falg is :  "+ flag);
		
	}

}

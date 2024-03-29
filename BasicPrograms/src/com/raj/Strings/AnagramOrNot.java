package com.raj.Strings;

import java.util.Arrays;

public class AnagramOrNot 
{

	public static void main(String[] args)
	{
		String s1 = "race";
		String s2 = "care";
		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
		
		if(a1.length==a2.length)
		{
			Arrays.sort(a1);
			Arrays.sort(a2);
			
			boolean result =  Arrays.equals(a1,a2);
			
			if(result)
			{
				System.out.println("Anagram");
			}
			else 
			{
				System.out.println("No");
			}
		}
		else 
		{
			System.out.println("No");
		}
	}

}

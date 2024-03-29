package com.raj.Day6;

import java.util.Arrays;

public class AnagramorNot 
{

	public static void main(String[] args) 
	{
		String s1 = "listen";
		String s2 = "silent";
		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
		
		if(s1.length()==s2.length())
		{
			Arrays.sort(a1);
			Arrays.sort(a2);
			
			boolean result = Arrays.equals(a1, a2);
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

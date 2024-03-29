package com.raj.strings;

import java.util.Arrays;

public class Anagram 
{

	public static void main(String[] args)
	{
		String s1 = "silent";
		String s2 = "listen";
		
		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
		
		if(a1.length==a2.length)
		{
			Arrays.sort(a1);
			Arrays.sort(a2);
			
			boolean res = Arrays.equals(a1,a2);
			
			if(res)
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not Anagram");
			}
		}
		else
		{
			System.out.println("Not Anagram");
		}
	}
}

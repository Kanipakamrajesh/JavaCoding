package com.raj.Day6;

import java.util.Arrays;

public class AlphabeticalOrder 
{

	public static void main(String[] args)
	{
		String s1 = "apple";
		String s2 = sort(s1);
		System.out.println(s2);
	}
	static String sort(String s)
	{
		char[] a = s.toCharArray();
		Arrays.sort(a);
		return new String(a);
	}
}

package com.raj.strings;

import java.util.Arrays;

public class Sort 
{

	public static void main(String[] args)
	{
		String s = "apple";
		System.out.println(sort(s));
	}
	static String sort(String s)
	{
		char[] a = s.toCharArray();
		Arrays.sort(a);
		return new String(a);
	}

}

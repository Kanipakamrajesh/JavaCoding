package com.raj.Strings;

import java.util.Arrays;

public class Sort
{

	public static void main(String[] args) 
	{
		String s = "Banana";
		//char[] a = s.toCharArray();
		System.out.println(sort(s));
		
	}
	static String sort(String s)
	{
		char[] a = s.toCharArray();
		Arrays.sort(a);
		return new String(a);
	}

}

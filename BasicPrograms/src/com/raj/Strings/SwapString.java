package com.raj.Strings;

public class SwapString 
{

	public static void main(String[] args) 
	{
		String s = "java is an oop lang";
		String[] arr = s.split(" ");
		String s2 = "";
		for(int i=arr.length-1;i>=0;i--)
		{
			s2 = s2 + swap(arr[i]);
			s2 = s2 + " ";
		}
		s2 = s2.trim();
		System.out.println(s2);
	}
	static String swap(String s)
	{
		//char[] a = s.toCharArray();
		String rev = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev + s.charAt(i);
		}
		return new String(rev);
	}

}

package com.raj.strings;

public class Pallindrome
{

	public static void main(String[] args)
	{
		String s = "malayalam";
		System.out.println(isPallindrome(s));
	}
	static boolean isPallindrome(String s)
	{
		char[] a = s.toCharArray();
		int i=0,j=a.length-1;
		while(i<j)
		{
			if(a[i]!=a[j])
			{
				return false;
			}
			else 
			{
				i++;
				j--;
			}
		}
		return true;
	}

}

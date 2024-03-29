package com.raj.Strings;

public class IndexValue
{

	public static void main(String[] args) 
	{
		String s = "banana";
		char[] a = s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			char ch = s.charAt(i);
			if(a[i]==ch) System.out.println(a[i]+"="+i);
		}
	}

}

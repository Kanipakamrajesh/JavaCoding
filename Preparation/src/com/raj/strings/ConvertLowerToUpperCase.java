package com.raj.strings;

public class ConvertLowerToUpperCase {

	public static void main(String[] args) 
	{
		String s = "Rajesh";
		char[] a = s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>='a' && a[i]<='z')
			{
				a[i] =(char)(a[i]-32);
			}
		}
		System.out.println(s);
		System.out.println(a);
	}

}

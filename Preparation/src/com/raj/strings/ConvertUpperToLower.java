package com.raj.strings;

public class ConvertUpperToLower
{

	public static void main(String[] args)
	{
		String s = "RAJESH";
		char[] a = s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>='A' && a[i]<='Z')
			{
				a[i] = (char)(a[i]+32);
			}
		}
		System.out.println(s);
		System.out.println(a);
	}

}

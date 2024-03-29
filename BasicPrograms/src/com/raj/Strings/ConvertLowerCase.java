package com.raj.Strings;

public class ConvertLowerCase
{

	public static void main(String[] args)
	{
		String s = "java";
		char[] a = s.toCharArray();
		String s2 = "";
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>='a' && a[i]<='z')
			{
			a[i] = (char)(a[i]-32);
			}
		}
		System.out.println(a);
		System.out.println(convert("JAVA"));
	}
	static String convert(String s)
	{
		char[] b = s.toCharArray();
		for(int i=0;i<b.length;i++)
		{
			if(b[i]>='A' && b[i]<='Z')
			{
				b[i] = (char)(b[i]+32);
			}
		}
		return  new String(b);
	}
	

}

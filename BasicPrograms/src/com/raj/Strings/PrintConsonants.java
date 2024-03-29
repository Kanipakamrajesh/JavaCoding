package com.raj.Strings;

public class PrintConsonants
{

	public static void main(String[] args) 
	{
		String s = "java developer";
		char[] a = s.toCharArray();
		String s2 = "";
		for(char c:a)
		{
			if(c!='a' || c!='e' || c!='i' || c!='o' || c!='u')
			{
				s2 = s2 + c;
			}
		}
		System.out.println(s2);
	}

}

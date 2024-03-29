package com.raj.strings;

public class NumberOfVowels 
{
	public static void main(String[] args)
	{
		String s = "developer";
		char[] a = s.toCharArray();
		int count = 0;
		for(char c:a)
		{
			switch(c)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':count++;
			}
		}
		System.out.println(count);
	}

}

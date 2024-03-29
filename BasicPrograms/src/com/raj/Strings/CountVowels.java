package com.raj.Strings;

public class CountVowels 
{

	public static void main(String[] args)
	{
		String s = "java developer";
		System.out.println(Vowel(s));
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
	static int Vowel(String s)
	{
		char[] a = s.toCharArray();
		int count=0;
		for(char c:a)
		{
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			{
				count++;
			}
		}
		return count;
	}

}

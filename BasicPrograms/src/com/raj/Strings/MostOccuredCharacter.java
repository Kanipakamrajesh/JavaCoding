package com.raj.Strings;

public class MostOccuredCharacter
{
	public static void main(String[] args)
	{
		String s = "banana";
		int count = 0;
		char ch1 = s.charAt(0);
		while(s.length()>0)
		{
			char ch2 = s.charAt(0);
			String s2 = s.replace(ch2+"","");
			int c = s.length()-s2.length();
			if(c>count)
			{
				count = c;
				ch1 = ch2;
			}
			s = s2;
		}
		System.out.println(ch1+" = "+count);
	}
}

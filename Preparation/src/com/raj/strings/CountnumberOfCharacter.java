package com.raj.strings;

public class CountnumberOfCharacter
{
	public static void main(String[] args)
	{
		String s = "Developer";
		char c;
		String s2;
		while(s.length()>0)
		{
			 c = s.charAt(0);
			 s2 = s.replace(c+"", "");
			 int count = s.length()-s2.length();
			 System.out.println(c+" = "+count);
			 s = s2;
		}
		
	}

}

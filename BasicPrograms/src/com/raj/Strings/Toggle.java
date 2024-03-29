package com.raj.Strings;

public class Toggle
{
	public static void main(String[] args)
	{
		String s = "Rajesh";
		char[] a = s.toCharArray();
		String s2 = "";
		for(char c:a)
		{
			if(c>='a'&&c<='z')
			{
				s2 = s2 + Character.toUpperCase(c);
			}
			else if(c>='A'&&c<='Z')
			{
				s2 = s2 + Character.toLowerCase(c);
			}
			else
			{
				s2 = s2 +  c;
			}
			
		}
		System.out.println(s2);
	}

}

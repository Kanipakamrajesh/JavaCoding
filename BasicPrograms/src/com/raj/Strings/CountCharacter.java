package com.raj.Strings;

public class CountCharacter
{

	public static void main(String[] args) 
	{
		String s = "java developer";
		int count = 0;
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch!=' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}

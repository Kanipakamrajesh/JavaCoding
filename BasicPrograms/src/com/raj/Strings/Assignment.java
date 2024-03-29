package com.raj.Strings;

public class Assignment
{

	public static void main(String[] args)
	{
		String s1 = "a?c";
		String s2 = "??b";
		int min = 0, max = 0;
		int count = 0,diff=0;
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				if(s1.charAt(i)=='?'||s2.charAt(i)=='?')
				{
					count++;
				}
				else
				{
					diff++;
				}
			}
		}
		max = count+diff;
		min = diff;
		
		System.out.println(min+" "+max);
	}

}

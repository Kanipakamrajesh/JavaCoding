package com.raj.Strings;

public class Ascending 
{

	public static void main(String[] args)
	{
		String s = "successabccdefgghikllhsjssssddddd";
		int count  = 0;
		String s2 = "";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(s2.indexOf(ch)==-1)
			{
				s2 = s2 + ch;
			}
		}
		System.out.println(s2);
	}

}

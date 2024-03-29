package com.raj.Strings;

public class RemoveSpace
{

	public static void main(String[] args) 
	{
		String s = "java developer";
		char[] a = s.toCharArray();
		String s2 = "";
		for(char c:a)
		{
			if(c!=' ')
			{
				s2 = s2 +c;
			}
		}
		System.out.println(s2);
	}

}

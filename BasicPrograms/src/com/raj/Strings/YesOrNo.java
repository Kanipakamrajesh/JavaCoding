package com.raj.Strings;

import java.util.Scanner;

public class YesOrNo
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = scn.next();
		
		if(is(s))
		{
			System.out.println("Yes");
		}
		else System.out.println("No");
		
	}
	static boolean is(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='0' && ch<='9')
			{
				return true;
			}
		}
		return false;
	}

}

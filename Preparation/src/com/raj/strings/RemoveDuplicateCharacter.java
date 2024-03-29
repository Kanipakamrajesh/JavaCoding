package com.raj.strings;

public class RemoveDuplicateCharacter
{

	public static void main(String[] args)
	{
		String s = "success";
		String s2 = "";
		for(int i=0;i<s.length()-1;i++)
		{
			char ch = s.charAt(i);
			if(s2.indexOf(ch)==-1) s2 = s2 + ch;
		}
		System.out.println(s2);
	}

}

package com.raj.Strings;

public class RemoveDuplicateWord
{

	public static void main(String[] args) 
	{
		String s = "java is an easy java is an simple";
		String[] a = s.split(" ");
		String s2 = "";
		for(String str:a)
		{
			if(s2.indexOf(str)==-1)
			{
				s2 = s2 + str;
				s2 = s2 + " ";
			}
		}
		System.out.println(s2);
	}

}

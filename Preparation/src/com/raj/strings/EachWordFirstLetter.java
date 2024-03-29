package com.raj.strings;

public class EachWordFirstLetter
{

	public static void main(String[] args)
	{
		String s = "java is an oop lang";
		String[] str = s.split(" ");
		String s3 ="";
		for(int i=0;i<str.length;i++)
		{
			char c = str[i].charAt(0);
			String s2 = String.valueOf(c).toUpperCase();
			String sub = str[i].substring(1);
			s3 = s3 + s2 + sub + " ";
		}
		System.out.println(s);
		System.out.println(s3.trim());
	}

}

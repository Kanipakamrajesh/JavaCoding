package com.raj.Strings;

public class FirstLetterCapital
{

	public static void main(String[] args)
	{
		String s = "i love my india";
		String[] arr = s.split(" ");
		String s3 = "";
		for(int i=0;i<arr.length;i++)
		{
			char c = arr[i].charAt(0);
			String s2 = String.valueOf(c).toUpperCase();
			String sub = arr[i].substring(1);
			s3 = s3 + s2 + sub+" ";
		}
		System.out.print(s3.trim());
	}

}

package com.raj.Day6;

public class ReverseEachWord 
{

	public static void main(String[] args)
	{
		String s1 = "java is an oop lang";
		String[] arr = s1.split(" ");
		String s2 = "";
		for(String str:arr)
		{
			s2 = s2 + rev(str);
			s2 = s2 + " ";
		}
			s2 = s2.trim();
			System.out.println(s2);
		
	}
	static String rev(String s)
	{
		char[] a = s.toCharArray();
		int i = 0, j = a.length-1;
		while(i<j)
		{
			char temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
		}
		return new String(a);
	}

}

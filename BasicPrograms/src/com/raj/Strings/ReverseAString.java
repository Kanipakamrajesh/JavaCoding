package com.raj.Strings;

public class ReverseAString
{

	public static void main(String[] args)
	{
		String s = "java is an oop lang";
		String s2 = "";
		String[] arr = s.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
		    s2 = s2 + rev(arr[i]);
			s2 = s2 + " ";
			
		}
		s2 = s2.trim();
		System.out.println(s2);
	}
	static String rev(String s)
	{
		char[] a = s.toCharArray();
		int i=0,j=a.length-1;
		while(i<=j)
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

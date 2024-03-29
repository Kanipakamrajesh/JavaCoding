package com.raj.strings;

public class Reverse 
{
	public static void main(String[] args) 
	{
		String s = "Rajesh";
		char[] a = s.toCharArray();
		int i=0,j=a.length-1;
		while(i<j)
		{
			char temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		System.out.println(a);
	}
}
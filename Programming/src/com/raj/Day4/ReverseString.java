package com.raj.Day4;

public class ReverseString
{

	public static void main(String[] args)
	{
		String s1 = "java is oop lang";
		String[] a  = s1.split(" ");
		int i = 0,j = a.length-1;
		while(i<=j)
		{
			String temp = a[i];
				a[i] = a[i+2];
				a[i+2] = temp;
		}
		System.out.println(s1);
	}

}

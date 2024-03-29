package com.raj.patterns;

import java.util.Scanner;

public class ReverseUsing
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = scn.nextInt();
		String s = "*";
		String rev="";
		for(int i=n;i>=1;i--)
		{
			rev=" "+s+rev;
			s=s+"*";
		}
		
		System.out.print(s+" ");
	}
	

}

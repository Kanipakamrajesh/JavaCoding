package com.raj.patterns;

import java.util.Scanner;

public class RightTriangleUsingSingle
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = scn.nextInt();
		String s = "*";
		for(int i=1;i<=n;i++)
		{
			System.out.println(s);
			s = s+"*";
		}
		
		
	}

}

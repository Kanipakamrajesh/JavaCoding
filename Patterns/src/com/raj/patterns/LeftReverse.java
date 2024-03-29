package com.raj.patterns;

import java.util.Scanner;

public class LeftReverse
{

	public static void main(String[] asgs)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n =  scn.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int k=2;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

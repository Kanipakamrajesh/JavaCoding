package com.raj.patterns;

import java.util.Scanner;

public class EquilateralReverse 
{

	public static void main(String[] args) 
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
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

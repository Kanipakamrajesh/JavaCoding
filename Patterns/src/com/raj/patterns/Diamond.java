package com.raj.patterns;

import java.util.Scanner;

public class Diamond 
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n =  scn.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int k=n-1;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=2;i<=n;i++)
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

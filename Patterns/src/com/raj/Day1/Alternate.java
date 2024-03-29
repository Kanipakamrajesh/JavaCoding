package com.raj.Day1;

import java.util.Scanner;

public class Alternate 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = scn.nextInt();
		int t = 0;
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				int x = (i*t)+1;
				for(int j=1;j<=i;j++) System.out.print(x+++" ");
				t++;
			}
			else
			{
				int x = i*(i+1)/2;
				for(int j=1;j<=i;j++) System.out.print(x--+" ");
			}
			System.out.println();
		}
	}

}

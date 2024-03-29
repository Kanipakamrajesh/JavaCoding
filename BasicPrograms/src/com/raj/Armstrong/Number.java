package com.raj.Armstrong;

import java.util.Scanner;

public class Number 
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter First Range");
		int m = scn.nextInt();
		System.out.println("Enter Second Range");
		int n = scn.nextInt();
		int dsum = 0;
		int ndsum = 0;
		for(int i=1;i<=n;i++)
		{
			if(i%m==0)
			{
				dsum+=i;
			}
			else
			{
				ndsum+=i;
			}
		}
		int res = ndsum-dsum;
		System.out.println(res);
	}

}

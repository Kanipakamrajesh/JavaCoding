package com.raj.common;

import java.util.Scanner;

public class HCFOfTwoNumbers
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a First Number");
		int a = scn.nextInt();
		System.out.println("Enter a Second Number");
		int b = scn.nextInt();
		int hcf = 0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0 && b%i==0)
			{
				hcf = i;
			}
		}
		System.out.println("HCF Of "+a+" and "+b+" is "+hcf);
	}

}
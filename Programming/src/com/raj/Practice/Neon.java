package com.raj.Practice;

import java.util.Scanner;

public class Neon 
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = scn.nextInt();
		if(n<0)
		{
			System.out.println("No Negatives");
		}
		else
		{
		int temp = n;
		int sum = 0;
		while(n!=0)
		{
			int rem = n%10;
			System.out.println("Remainder is "+rem);
			sum = sum + rem;
			System.out.println("Sum is "+sum);
			n = n/10;
			System.out.println("**************");
		}
		if(temp%sum==0)
		{
			System.out.println("Neon");
		}
		else System.out.println("NOt");
		}
	}

}

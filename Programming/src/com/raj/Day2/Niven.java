package com.raj.Day2;

import java.util.Scanner;

public class Niven
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = scn.nextInt();
		int sum = 0;
		int temp =n;
		while(n!=0)
		{
			
			int rem =  n%10;
			System.out.println("Remainder is "+rem);
			sum = sum + rem;
			System.out.println("Sum is "+sum);
			n = n/10;
			System.out.println("********************");
		}
		if(temp%sum==0)
		{
			System.out.println("Niven Number");
		}
		else System.out.println("Not Niven");
	}

}

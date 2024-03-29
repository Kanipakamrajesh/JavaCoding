package com.raj.Day2;

import java.util.Scanner;

public class Neon 
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = scn.nextInt();
		int prod = n*n;
		int temp = prod;
		int sum = 0;
		while(prod>0)
		{
			
			int  rem = prod%10;
			sum = sum + rem;
			prod = prod/10;
		}
		if(n==sum)
		{
			System.out.println("Neon");
		}
		else System.out.println("No");
	}

}

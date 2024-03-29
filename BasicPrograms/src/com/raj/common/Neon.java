package com.raj.common;

public class Neon
{

	public static void main(String[] args) 
	{
		int n = 9;
		int prod = n*n;
		int sum = 0;
		while(prod>0)
		{
			int rem = prod%10;
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

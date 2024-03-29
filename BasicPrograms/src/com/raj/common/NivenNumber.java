package com.raj.common;

public class NivenNumber
{

	public static void main(String[] args)
	{
		int n = 11;
		int temp = n;
		int sum = 0;
		while(n!=0)
		{
			int rem = n%10;
			sum = sum + rem;
			n = n/10;
		}
		if(temp%sum==0)
		{
			System.out.println("Niven");
		}
		else System.out.println("No");
	}

}

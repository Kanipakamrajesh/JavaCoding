package com.raj.common;

public class PallindromeOrNot
{

	public static void main(String[] args)
	{
		int n = 121;
		int temp = n;
		int sum = 0;
		while(n!=0)
		{
			int rem = n%10;
			sum = sum *10+rem;
			n = n/10;
		}
		if(sum==temp)
		{
			System.out.println("Palindrome");
		}
		else System.out.println("No");
		
	}

}

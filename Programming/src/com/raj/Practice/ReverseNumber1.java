package com.raj.Practice;

public class ReverseNumber1
{
	public static void main(String[] args)
	{
		int num = 12;
		int temp = num;
		int sum = 0;
		int rev = 0;
		int prod = 1;
		while(num!=0)
		{
			int rem = num%10;
			rev = rev*10 + rem;
			num = num/10;
		}
		prod = prod*rev*temp;
		System.out.println(prod);
		while(prod!=0)
		{
			int digit = prod%10;
			sum = sum+digit;
			prod = prod/10;
		}
		if(sum==temp || sum==rev)
		{
			System.out.println("Special Number");
		}
		else 
		{
			System.out.println("No");
		}
	}
}
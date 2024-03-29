package com.raj.common;

public class Strong
{

	public static void main(String[] args) 
	{
		int n = 145;
		int temp = n;
		int sum = 0;
		while(n>0)
		{
			int fact = 1;
			int rem = n%10;
			for(int i=1;i<=rem;i++)
			{
				fact = fact*i;
			}
			sum = sum + fact;
			n = n/10;
		}
		if(sum==temp)
		{
			System.out.println("Strong");
		}
		else System.out.println("No");
	}

}

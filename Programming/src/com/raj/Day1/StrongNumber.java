package com.raj.Day1;

public class StrongNumber
{

	public static void main(String[] args)
	{
		int n = 145;
		int temp = n;
		//int fact = 1;
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
		if(temp==sum)
		{
			System.out.println("Strong Number");
		}
		else System.out.println("Not");
		
	}

}

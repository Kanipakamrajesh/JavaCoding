package com.raj.Day1;

public class HCF 
{

	public static void main(String[] args)
	{
		int a = 12;
		int b = 7;
		int hcf = 0;
		for(int i=1;i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				hcf = i;
			}
		}
		System.out.println("HCF of "+a+" and "+b+" is "+hcf);
	}

}

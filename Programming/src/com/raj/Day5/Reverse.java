package com.raj.Day5;

public class Reverse
{

	public static void main(String[] args) 
	{
		int a = 123;
		while(a>0)
		{
			int rem = a%10;
			System.out.print(rem);
			a = a/10;
		}
	}

}

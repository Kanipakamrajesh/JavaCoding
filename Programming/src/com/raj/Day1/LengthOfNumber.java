package com.raj.Day1;

public class LengthOfNumber
{
	public static void main(String[] args) 
	{
		int n = 2639650;
		int temp = n;
		int count = 0;
		while(n!=0)
		{
			n = n/10;
			count++;
		}
		System.out.println(count);
	}
}
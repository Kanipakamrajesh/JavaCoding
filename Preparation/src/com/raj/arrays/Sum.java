package com.raj.arrays;

public class Sum 
{

	public static void main(String[] args) 
	{
		int[] a = {1,3,5,7};
		int sum = 0;
		for(int n:a)
		{
			sum = sum + n;
		}
		System.out.println(sum);
	}

}

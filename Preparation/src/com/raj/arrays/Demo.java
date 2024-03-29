package com.raj.arrays;

public class Demo 
{

	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4};
		int[] b = new int[3];
		b[0] = 1;
		b[1] = 2;
		b[2] = 4;
		//b[3] = 5;
		for(int n:a)
		{
			System.out.print(n+" ");
		}
		System.out.println();
		for(int n:b)
		{
			System.out.print(n+" ");
		}
	}

}

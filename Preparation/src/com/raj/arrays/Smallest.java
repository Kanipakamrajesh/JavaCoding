package com.raj.arrays;

public class Smallest 
{

	public static void main(String[] args) 
	{
		int[] a = {8,7,2,9,5,4,1};
		int s = a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<s) s = a[i];
		}
		System.out.println(s);
		
	}

}

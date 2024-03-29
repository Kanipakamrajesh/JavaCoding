package com.raj.arrays;

public class SecondBiggest 
{
	public static void main(String[] args)
	{
		int[] a = {2,5,13,56,97,54,67};
		int b1 = a[0];
		int b2 = a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>b1)
			{
				b2 = b1;
				b1 = a[i];
			}
			else if(a[i]>b2 || b1==b2)
			{
				if(a[i]!=b1) b2 = a[i]; 
			}			
		}
		System.out.println(b2);
	}
}

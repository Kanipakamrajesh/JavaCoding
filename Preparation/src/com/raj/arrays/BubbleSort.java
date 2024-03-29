package com.raj.arrays;

public class BubbleSort 
{

	public static void main(String[] args)
	{
		int[] a = {3,7,8,9,1,4};
		sort(a);
		for(int n:a)
		{
			System.out.print(n+" ");
		}
	}
	static void sort(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}

}

package com.raj.Practice;

public class LinearSearch 
{

	public static void main(String[] args)
	{
		int[] a = {1,4,5,7,8,9,3};
		System.out.println(search(a,3));
	}
	static int search(int[] a,int x)
	{
		for(int i=0;i<a.length;i++)
		{
			if(x==a[i]) return i;
		}
		return -1;
	}

}

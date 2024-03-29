package com.raj.Arrays;

public class LinearSearch
{

	public static void main(String[] args) 
	{
		int[] a = {2,6,8,1,5,9,4};
		System.out.println(search(a,1));
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

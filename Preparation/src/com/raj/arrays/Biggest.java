package com.raj.arrays;

public class Biggest
{

	public static void main(String[] args)
	{
		int[] a = {2,65,24,17,98};
		int g = a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>g) g = a[i];
		}
		System.out.println(g);
	}

}

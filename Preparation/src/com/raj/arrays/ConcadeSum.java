package com.raj.arrays;

public class ConcadeSum 
{

	public static void main(String[] args)
	{
		int[] a = {1,4,2,7,8,9};
		int sum = 0;
		String s = "";
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
			s = s+a[i];
			if(i<a.length-1) s = s+"+";
		}
		s = s+"="+sum;
		System.out.println(s);
	}

}

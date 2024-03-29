package com.raj.arrays;

public class SecondSmallest 
{

	public static void main(String[] args)
	{
		int[] a = {1,4,6,5,12,14,3};
		int s1 = a[0];
		int s2 = a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<s1)
			{
				s2 = s1;
				s1 = a[i];
			}
			else if(a[i]<s2 || s1==s2)
			{
				if(a[i]!=s1) s2 = a[i];
			}
		}
		System.out.println(s2);
	}

}

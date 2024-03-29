package com.raj.Practice;

public class RemoveDuplicateArray
{

	public static void main(String[] args)
	{
		int[] a = {1,2,2,3,3,3,4,5,6,6,7,0};
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				a[i] = -1;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=-1)
			{
			System.out.print(a[i]+" ");
			}
		}
	}

}

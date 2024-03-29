package com.raj.common;

public class Sortings 
{

	public static void main(String[] args) 
	{
		int[] a = {1,7,3,8,2,4,5,9};
		insertion(a);
		display(a);
		
	}
	static void display(int[] a)
	{
		for(int n:a)
		{
			System.out.print(n+" ");
		}
		
	}
	static int[] bubble(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					   a[j]  = a[j+1];
					a[j+1]   = temp;
				}
			}
		}
		return a;
	}
	static int[] selection(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			int index = i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[index])
				{
					index = j;
				}
			}
			if(i!=index)
			{
				int temp = a[i];
				   a[i]  = a[index];
				a[index] = temp;
			}
		}
		return a;
	}
	static int[] insertion(int[] a)
	{
		for(int i=1;i<a.length;i++)
		{
			int key = a[i];
			int j = i-1;
			while(j>=0 && a[j]>key)
			{
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
		}
		return a;
	}
}





















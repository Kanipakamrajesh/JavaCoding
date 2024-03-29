package com.raj.arrays;

public class SelectionSort 
{
	public static void main(String[] args) 
	{
		int[] a = {5,8,1,6,9,2};
		sort(a);
		for(int n:a)
		{
			System.out.print(n+" ");
		}
	}
	static void sort(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			int index = i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[index]) index = j;
			}
			if(i!=index)
			{
				int temp = a[i];
				a[i] = a[index];
				a[index] = temp;
			}
		}
	}
}





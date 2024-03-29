package com.raj.Arrays;

public class Sortings 
{
	public static void main(String[] args) 
	{
		int[] a = {2,6,7,3,9,5};
	    insertionSort(a);
		display(a);
	}
	static void display(int[] a)
	{
		for(int n:a)
		{
			System.out.print(n+" ");
		}
		System.out.println();
	}
	static int[] bubbleSort(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
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
		return a;
	}
	static int[] selectionSort(int[] a)
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
		return a;
	}
	static int[] insertionSort(int[] a)
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
			a[j+1] =  key;
		}
		return a;
	}
}

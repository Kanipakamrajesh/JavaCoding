package com.raj.Practice;

public class QuickSort
{

	public static void main(String[] args) 
	{
		int[] a = {6,9,2,5,8,1,7};
		sort(a,0,a.length-1);
		for(int n:a)
		{
			System.out.print(n+" ");
		}
		System.out.println();
	}
	static void sort(int[] a,int start,int end)
	{
		if(start>=end) return;
		int i=start;
		int j = end;
		while(i<=j)
		{
			int pivot = a[(start+end)/2];
			while(a[i]<pivot)i++;
			while(a[j]>pivot)j--;
			if(i<=j)
			{
				int temp = a[i];
				    a[i] = a[j];
				    a[j] = temp;
				    i++;
				    j--;
			}
		}
		sort(a,start,j);
		sort(a,i,end);
	}

}

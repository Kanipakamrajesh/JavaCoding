package com.raj.Arrays;

public class BinarySearchUsingLoop
{

	public static void main(String[] args)
	{
		int[] a = {2,4,6,7,9,15,17};
		System.out.println(search(a,7));
		System.out.println(search(a,14));
	}
	static int search(int[] a,int x)
	{
		int start = 0, end = a.length-1;
		while(start<=end)
		{
		int mid = (start+end)/2;
		if(x==a[mid]) return mid;
		else if(x<a[mid]) end = mid-1;
		else start=mid+1;
		}
		return -1;
	}

}

package com.raj.Arrays;

public class BinarySearchUsingRecursion
{

	public static void main(String[] args)
	{
		int[] a = {1,3,5,7,9,11,13,14,17};
		System.out.println(search(a,13,0,a.length-1));
		System.out.println(search(a,27,0,a.length-1));
	}
	static int search(int[] a,int x,int start,int end)
	{
		if(start>end) return -1;
		int mid = (start+end)/2;
		if(x==a[mid]) return mid;
		else if(x<a[mid]) return search(a,x,start,mid-1);
		else return search(a,x,mid+1,end);
	}

}

package com.raj.Practice;

public class BinarySearchUsingRecursion
{

	public static void main(String[] args)
	{
		int[] a = {4,6,3,7,1,9,8};
		System.out.println(search(a,9,0,a.length-1));
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

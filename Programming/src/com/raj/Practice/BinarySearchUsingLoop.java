 package com.raj.Practice;

public class BinarySearchUsingLoop 
{

	public static void main(String[] args)
	{
		int[] a =  {3,4,5,7,8,9,1,6};
		System.out.println(search(a,7));
	}
	static int search(int[] a,int x)
	{
		int start = 0, end = a.length-1;
		while(start<=end)
		{
			int mid = (start+end)/2;
			if(x==a[mid]) return mid;
			else if(x<a[mid]) end = mid-1;
			else start = mid+1;
		}
		return -1;
	}

}

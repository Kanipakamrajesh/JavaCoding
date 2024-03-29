package com.raj.Practice;

public class Insert 
{

	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5};
		System.out.println(a.length);
		int[] temp = new int[a.length+1];
		for(int i=0;i<a.length;i++)
		{
			temp[i] = a[i];
		}
		a = temp;
		for(int n:a)
		{
			System.out.print(n+" ");
		}
		System.out.println();
	    int index = 2;
	    int key = 7;
		for(int i = a.length-1;i>=index;i--)
		{
			a[i] = a[i-1];
		}
		a[index] = key;
		for(int s:a)
		{
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println(a.length);
	}

}

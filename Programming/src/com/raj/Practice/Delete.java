package com.raj.Practice;

public class Delete 
{

	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5};
		for(int n:a)
		{
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println(a.length);
		int index = 2;
		for(int i=index+1;i<a.length;i++)
		{
			a[i-1] = a[i];
		}
		int[] temp = new int[a.length-1];
		for(int i=0;i<a.length-1;i++)
		{
			temp[i] = a[i];
		}
		a = temp;
		for(int n:a)
		{
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println(a.length);
	}
}

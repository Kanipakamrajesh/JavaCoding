package com.raj.Practice;

public class EvenIndexOddIndex 
{

	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5,6};
		int[] even = new int[a.length/2];
		int[] odd = new int[a.length-even.length];
		int index = 0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				even[index++] = a[i];
			}
		}
		System.out.println(even[0]);
	}

}

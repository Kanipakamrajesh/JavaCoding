package com.raj.Practice;

public class Search 
{

	public static void main(String[] args)
	{
		int[] a = {1,2,5,6,2,9,19};
		int key = 9;
		for(int i=0;i<a.length;i++)
		{
			if(key==a[i])
			{
				System.out.println(i+" is the index value");
			}
			else
			{
				if(key==a[i])
				System.out.println("not found");
				
			}
		}
	}

}

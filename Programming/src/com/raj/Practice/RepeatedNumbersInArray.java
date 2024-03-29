package com.raj.Practice;

import java.util.Arrays;

public class RepeatedNumbersInArray
{

	public static void main(String[] args)
	{
		int[] a = {1,2,4,3,4,5,6,5,7,6,0,0};
		//Arrays.sort(a);
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]==a[j])
			{
				System.out.print(a[i]+" ");
			}
			}
		}
	}

}

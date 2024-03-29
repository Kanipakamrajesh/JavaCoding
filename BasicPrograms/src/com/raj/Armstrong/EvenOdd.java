package com.raj.Armstrong;

public class EvenOdd 
{

	public static void main(String[] args) 
	{
		int[] a = {3,2,1,7,5,4};
		int[] even = new int[a.length/2];
		int[] odd = new int[a.length-even.length];
		int even_index = 0;
		int odd_index = 0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				even[even_index++] = a[i];
			}
			else
			{
				odd[odd_index++] = a[i];
			}
		}
		int s = smallest(even);
		int l = largest(odd);
		int res = s+l;
		System.out.println(res);
		
	}
	static int smallest(int[] a)
	{
		int s1 = a[0];
		int s2 = a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<s1)
			{
				s2 = s1;
				s1 = a[i];
			}
			else if(a[i]<s2 || s1==s2)
			{
				if(a[i]!=s1)
				{
					s2 = a[i];
				}
			}
		}
		return s2;
	}
	static int largest(int[] a)
	{
		int l1 = a[0];
		int l2 = a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>l1)
			{
				l2 = l1;
				l1 = a[i];
			}
			else if(a[i]>l2 || l1==l2)
			{
				if(a[i]!=l1)
				{
					l2 = a[i];
				}
			}
		}
		return l2;
	}
}





















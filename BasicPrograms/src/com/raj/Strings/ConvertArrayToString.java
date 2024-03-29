package com.raj.Strings;

public class ConvertArrayToString 
{

	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4};
		int[] b = {1,2,3};
		int l = (a.length)>(b.length)?(a.length):(b.length);
		int[] c = new int[l];
		for(int i=0;i<c.length;i++)
		{
			if(i<a.length && i<b.length)
			{
				c[i] = a[i]+b[i];
			}
			else if(i>=a.length)
			{
				c[i] = b[i];
			}
			else if(i>=b.length)
			{
				c[i] = a[i];
			}
		}
		String s = "{"+c[0];
		for(int i=1;i<c.length;i++)
		{
			s = s + "," + c[i];
		}
		s = s + "}";
		System.out.println(s);
	}
	

}

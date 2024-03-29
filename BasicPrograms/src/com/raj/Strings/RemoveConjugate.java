package com.raj.Strings;

public class RemoveConjugate
{

	public static void main(String[] args)
	{
		String s = "abcddeffggh";
		char[] a = s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==a[i+1])
			{
			    a[i] = 0;
			}
		}
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=0)
			{
				System.out.println(a[i]);
			}
		}
	}

}

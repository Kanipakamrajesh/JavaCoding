package com.raj.Day4;

public class ReverseMiddle
{

	public static void main(String[] args)
	{
		String s = "knowledge";
		int start = 0;
		int end = s.length()-1;
		int mid = (start+end)/2;
		String res = "";
		for(int i=mid;i<=s.length()-1;i++)
		{
			res = res + s.charAt(i);
		}
		for(int i = mid-1;i>=0;i--)
		{
			res = res + s.charAt(i);
		}
		System.out.println(res);
	}

}

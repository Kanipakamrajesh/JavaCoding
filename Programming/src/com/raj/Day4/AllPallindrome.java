package com.raj.Day4;

public class AllPallindrome
{

	public static void main(String[] args)
	{
		String s1 = "malayalam";
		for(int i=0;i<s1.length()-1;i++)
		{
			for(int j=i+2;j<=s1.length();j++)
			{
				String s2 = s1.substring(i,j);
				if(isPallindrome(s2)) System.out.println(s2);
			}
		}
	}
	static  boolean isPallindrome(String s)
	{
		char[] a =  s.toCharArray();
		int i = 0, j = a.length-1;
		while(i<j)
		{
			if(a[i]!=a[j]) return false;
			i++;
			j--;
		}
		return true;
	}

}

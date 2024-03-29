package com.raj.Strings;

public class Add 
{

	public static void main(String[] args) 
	{
		System.out.println(sum(5,7));
		System.out.println(5-(-7));
		System.out.println(sum1(99,100));
	}
	static int sum(int a,int b)
	{
		while(b!=0)
		{
			int c = (a&b);
		//	System.out.println(c);
			a = a^b;
		//	System.out.println(a);
			b = c<<1;
		}
		return a;
	}
	static int sum1(int a,int b)
	{
		while(b!=0)
		{
			a++;
			b--;
		}
		return a;
	}

}

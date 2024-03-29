package com.raj.Day1;

public class LCM
{
	public static void main(String[] args)
	{
		int a = 3;
		int b = 4;
		int n = a>b?a:b;
		while(true)
		{
		if(n%a==0 && n%b==0)
		break;
		n++;
		}
		
		System.out.println("LCM of "+a+" and "+b+"is "+n);		
	}
}

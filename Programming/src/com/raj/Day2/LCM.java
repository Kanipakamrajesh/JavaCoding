package com.raj.Day2;

public class LCM
{

	public static void main(String[] args) 
	{
		int a = 3;
		int b = 7;
		int g,s;
		if(a>b)
		{
			 g = a;
			 s = b;
		}
		else
		{
		   g = b;
		   s = a;
		}
		if(g%s==0)
		{
			System.out.println(g);
		}
	}

}

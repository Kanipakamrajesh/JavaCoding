package com.raj.exception;

public class Demo3 
{

	public static void main(String[] args)
	{
		String s = "a";
		int n = 0;
		try
		{
		n = Integer.parseInt(s);
		}catch(NumberFormatException e)
		{
			System.out.println("handled");
		}
		System.out.println(n);
	}

}

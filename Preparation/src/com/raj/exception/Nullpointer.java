package com.raj.exception;

public class Nullpointer
{

	public static void main(String[] args) 
	{
		String s = "Rajesh";
		int n = 0;
		try
		{
		n = s.length();
		}catch(NullPointerException e)
		{
			System.out.println("Handled");
		}
		System.out.println(n);
	}

}

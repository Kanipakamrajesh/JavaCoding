package com.raj.Day1;

public class SwapNumbersWithOutVariable
{

	public static void main(String[] args)
	{
		int a = 30;
		int b = 70;
			a = a+b;
			b = a-b;
			a = a-b;
		System.out.println(a);
		System.out.println(b);
	}

}

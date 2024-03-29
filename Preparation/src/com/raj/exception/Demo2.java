package com.raj.exception;

public class Demo2
{

	public static void main(String[] args)
	{
		System.out.println("main starts");
		m1();
		System.out.println("main ends");
		
	}
	static void m1()
	{
		System.out.println("m1 starts");
		try
		{
		m2();
		}catch(ArithmeticException e)
		{
			System.out.println("Exception Handled in m1");
		}
		System.out.println("m1 ends");
		
	}
	static void m2()
	{
		System.out.println("m2 starts");
		int c = 10/0;
		System.out.println("m2 ends");
	}

}

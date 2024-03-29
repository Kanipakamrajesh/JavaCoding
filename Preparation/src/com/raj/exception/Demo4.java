package com.raj.exception;

public class Demo4
{

	public static void main(String[] args)
	{
		System.out.println("main starts");
		try
		{
		int c = 10/0;
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("main ends");
	}

}

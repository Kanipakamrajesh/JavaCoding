package com.raj.exception;

public class Demo6
{

	public static void main(String[] args) 
	{
		System.out.println("main starts");
		try
		{
		int a = 10/0;
		}finally {
			System.out.println("finally");
		}
		System.out.println("main ends");
	}

}

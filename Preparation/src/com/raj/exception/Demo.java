package com.raj.exception;

import java.util.Scanner;

public class Demo
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = 0;
		try
		{
			System.out.println("try starts");
		    c = a/b;
		    System.out.println("try ends");
		}catch(ArithmeticException e)
		{
			c = a/2;
			System.out.println("Catch Executed");
		}
		System.out.println(c);
	}

}

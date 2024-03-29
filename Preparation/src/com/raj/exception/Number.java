package com.raj.exception;

import java.util.Scanner;

public class Number 
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = 0;
		while(true)
		{
			try
			{
				String s = scn.next();
				n = Integer.parseInt(s);
				break;
			}catch(NumberFormatException e)
			{
				System.out.println("Wrong Input Please Enter a Number");
			}
		}
		System.out.println("n = "+n);
	}

}

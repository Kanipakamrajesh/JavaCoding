package com.raj.prime;

import java.util.Scanner;

public class Sample 
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("1.Sum");
		System.out.println("2.Substraction");
		System.out.println("3.Exit");
		System.out.println("choose");
		int ch = scn.nextInt();
		switch(ch)
		{
		case 1:
			sum();
			break;
		case 2:
			sub();
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("Choose valid");
			break;
		}
	}
	static void sum()
	{
		int a = 5;
		int b = 10;
		System.out.println(a+b);
	}
	static void sub()
	{
		int a = 10;
		int b = 5;
		System.out.println(a-b);
	}

}

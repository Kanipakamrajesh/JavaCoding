package com.raj.common;

import java.util.Scanner;

public class SwapTwoNumbersWithoutThird 
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = scn.nextInt();
		System.out.println("Enter second Number");
		int b = scn.nextInt();
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("*****************");
		System.out.println(a);
		System.out.println(b);
	}

}

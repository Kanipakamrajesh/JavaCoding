package com.raj.common;

import java.util.Scanner;

public class SwapTwoNumbersUsingThird
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first Number");
		int a = scn.nextInt();
		System.out.println("Enter second Number");
		int b = scn.nextInt();
		int temp = a;
			a =  b;
			b =  temp;
		System.out.println("********");
		System.out.println(a);
		System.out.println(b);
	}

}

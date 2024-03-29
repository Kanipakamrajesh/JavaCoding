package com.raj.basicprograms;

import java.util.Scanner;

public class SwapNumberUsingThird
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = scn.nextInt();
		System.out.println("Enter Second Number");
		int b = scn.nextInt();
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);
	}

}

package com.raj.basicprograms;

import java.util.Scanner;

public class SwapTwoNumbers 
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a First Number");
		int a = scn.nextInt();
		System.out.println("Enter a Second Number");
		int b = scn.nextInt();
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a);
		System.out.println(b);
	}

}

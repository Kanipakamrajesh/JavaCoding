package com.raj.Practice;

import java.util.Scanner;

public class LargestNumber
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = scn.nextInt();
		System.out.println("Enter Second Number");
		int b = scn.nextInt();
		System.out.println("Enter Third Number");
		int c = scn.nextInt();
		int max = (a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println("Largest Number is "+max);
	}

}

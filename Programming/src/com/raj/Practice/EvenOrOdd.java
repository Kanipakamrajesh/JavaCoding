package com.raj.Practice;

import java.util.Scanner;

public class EvenOrOdd
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = scn.nextInt();
		String check = (n%2==0)?("Even"):("Odd");
		System.out.println(n+" is "+check);
	}

}

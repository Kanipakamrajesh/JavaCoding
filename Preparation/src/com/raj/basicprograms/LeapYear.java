package com.raj.basicprograms;

import java.util.Scanner;

public class LeapYear 
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Year");
		int n = scn.nextInt();
		if((n%400==0) || (n%4==0 && n%100!=0))
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not a Leap Year");
		}
	}

}

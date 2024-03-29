package com.raj.Practice;

import java.util.Scanner;

public class LeapYear
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Year");
		int y = scn.nextInt();
		if((y%400==0) || (y%4==0 && y%100!=0))
		{
			System.out.println(y+" is Leap Year");
		}
		else
		{
			System.out.println(y+" is Not a Leap Year");
		}
	}

}

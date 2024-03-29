package com.raj.common;

import java.util.Scanner;

public class LeapYear
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter First Year");
		int m =  scn.nextInt();
		System.out.println("Enter Last Year");
		int n =  scn.nextInt();
		for(int i=m;i<=n;i++)
		{
			if(isLeap(i))
			{
				System.out.println(i);
			}
		}
		
	}
	static boolean isLeap(int y)
		{
		if((y%400==0) || (y%4==0 && y%100!=0))
		{
			//System.out.println("Given Year is Leap year");
			return true;
		}
		//else System.out.println("Common Year");
		else return false;
	}

}

package com.raj.programs;

import java.util.Scanner;

public class MonthDates 
{

	public static void main(String[] args) 
	{
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter a year: ");
    int y = scn.nextInt();
	System.out.println("Enter a Month: ");	
	int m = scn.nextInt();
	if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
	{
		System.out.println("31 Days");
	}
	else if(m==4||m==6||m==9||m==11)
	{
		System.out.println("30 Days");
	}
	else if(m==2)
	{
		if((y%400==0)||(y%100!=0 && y%4==0))
			System.out.println("29 Days");
		else
			System.out.println("28 Days");
	}
	else
	{
		System.out.println("Invalid Month");
	}
	}

}

package com.raj.Practice;

import java.util.Scanner;

public class Example
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("Menu:");
			System.out.println("1.For Factorial");
			System.out.println("2.For LCM Of Two Numbers");
			System.out.println("3.Exit");
			System.out.println("Select a Coice");
			choice = scn.nextInt();
			switch(choice)
			{
			case 1:
				 fact();
				 break;
			case 2:
				 lcm();
				 break;
			case 3:
				 System.out.println("Exit From The Program");
				 break;
			default:
				System.out.println("Invalid Option Please Select Valid Option");
		} 
		}while(choice != 3);
		  scn.close();
		
	    
	}
	static void fact()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number");
		int k = scn.nextInt();
		int fact = 1;
		for(int i=1;i<=k;i++)
		{
			fact = fact*i;
		}
		System.out.println(fact);
	}
	static void lcm()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = scn.nextInt();
		System.out.println("Enter Second Number");
		int b = scn.nextInt();
		int n = a>b?a:b;
		while(true)
		{
			if(n%a==0 && n%b==0)
			{
				break;
			}
			n++;
		}
		System.out.println("LCM of  "+a+" and "+b+" is "+n);
	}

}

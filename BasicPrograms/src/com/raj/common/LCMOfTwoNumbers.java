package com.raj.common;

import java.util.Scanner;

public class LCMOfTwoNumbers
{

	public static void main(String[] args) 
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
		break;
		n++;
		}
		System.out.println("LCM Of "+a+" and "+b+" is "+n);
	}

}

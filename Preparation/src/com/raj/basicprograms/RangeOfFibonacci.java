package com.raj.basicprograms;

import java.util.Scanner;

public class RangeOfFibonacci 
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter First Number");
		int m = scn.nextInt();
		System.out.println("Enter Second Number");
		int n = scn.nextInt();
		int a = 0;
		int b = 1;
		int c = 0;
		if(m==0)
		{
			System.out.println(0);
			return;
		}
	    System.out.print(a+" "+b);
	    while(true)
	    {
	    	c = a+b;
	    	if(c>=n)
	    	{
	    		break;
	    	}
	    	System.out.print(" "+c);
	    	if(c>=m)
	    	{
	    		a = b;
	    		b = c;
	    	}
	    }
	}

}

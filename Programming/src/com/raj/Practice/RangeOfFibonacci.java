package com.raj.Practice;

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
	    int a,b,c;
	    a = 0;
	    b = 1;
	    c = 0;
	    if(m==0)
	    {
	    	System.out.println(0);
	    	return;
	    }
	    System.out.print(a+" "+b);
	    for(;true;)
	    {
	    	c = a + b;
	    	if(c>=n)
	    	{
	    		break;
	    	}
	    	if(c>=m)
	    	{
	    	System.out.print(" "+c);
	    	}
	    	a = b;
	    	b = c;
	    }
	}

}

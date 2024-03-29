package com.raj.programs;

import java.util.Scanner;

public class SumOfNumbers 
{

	public static void main(String[] args)
	{
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter a Number: ");
    int n = scn.nextInt();
    int sum =  0;
    for(int i=1;i<=n;i++)
    {
    	sum = sum+i;
    }
	System.out.println("Sum is = "+sum);	
		
	}

}

package com.raj.programs;

import java.util.Scanner;

public class StrongNumber
{

	public static void main(String[] args) 
	{
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter a Number: ");
    int n = scn.nextInt();
    int fact = 1;
    int sum = 0;
    while(n>0)
    {
    	int rem =  n%10;
    	for(int i=1;i<=rem;i++)
    	{
    	 fact = fact*i;	
    	}
    	sum = sum+fact;
    	n = n/10;	
    }
	if(n==sum)
	{
		System.out.println("Strong Number");
	}
	else
	{
		System.out.println("No");
	}
		
	}

}

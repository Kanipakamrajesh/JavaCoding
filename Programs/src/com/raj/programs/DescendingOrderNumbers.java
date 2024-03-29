package com.raj.programs;

import java.util.Scanner;

public class DescendingOrderNumbers
{

	public static void main(String[] args)
	{
    Scanner scn =  new Scanner(System.in);
    System.out.println("Enter a Number: ");
    int num =  scn.nextInt();
    for(int i=num;i>=1;i--)
    {
    	System.out.println(i);
    }
		
	}

}


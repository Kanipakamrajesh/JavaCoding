package com.raj.programs;

import java.util.Scanner;

public class PrintNumbers
{

	public static void main(String[] args)
	{
     Scanner scn =  new Scanner(System.in);
     System.out.println("Enter a Number: ");
     int n = scn.nextInt();
     for(int i=1;i<=n;i++)
     {
    	 System.out.println(i);
     }
		
		
	}

}

package com.raj.programs;

import java.util.Scanner;

public class AtmPin
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Welcome To ATM");
		System.out.println("Please Enter ATM Pin");
		double pin = scn.nextDouble();
		double OP = 5257;
		if(OP==pin)
		{
			System.out.println("Enter Pin is Valid");
		}
		else System.out.println("Entered Pin is Invalid");
		

	}

}

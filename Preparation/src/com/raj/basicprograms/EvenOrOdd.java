package com.raj.basicprograms;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = scn.nextInt();
		if(n%2==0)
		{
			System.out.println("Given Number is Even");
		}
		else
		{
			System.out.println("Given Number is Odd Number");
		}
	}

}

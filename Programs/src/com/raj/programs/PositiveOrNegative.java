package com.raj.programs;
import java.util.Scanner;

public class PositiveOrNegative
{

	public static void main(String[] args)
	{
     Scanner scn =  new Scanner(System.in);
     System.out.println("Enter a Number: ");
     int n = scn.nextInt();
     if(n<0) System.out.println("Given Number is Negative");
     else System.out.println("Given Number is Positive");
		
		
	}

}

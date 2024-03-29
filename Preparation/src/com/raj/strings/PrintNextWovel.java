package com.raj.strings;

import java.util.Scanner;

public class PrintNextWovel
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Vowel");
		char c = scn.next().charAt(0);
		if(c<'e')
		{
			System.out.println("e");
		}
		else if(c<'i')
		{
			System.out.println("i");
		}
		else if(c<'o')
		{
			System.out.println("o");
		}
		else if(c<'u')
		{
			System.out.println("u");
		}
		else
		{
			System.out.println("No Next Vowel");
		}
	}

}

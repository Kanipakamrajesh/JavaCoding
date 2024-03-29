package com.raj.Strings;

import java.util.Scanner;

public class NextVowel 
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch = scn.next().charAt(0);
		if(ch<'e')
		{
			System.out.println('e');
		}
		else if(ch<'i')
		{
			System.out.println('i');
		}
		else if(ch<'o')
		{
			System.out.println('o');
		}
		else if(ch<'u')
		{
			System.out.println('u');
		}
		else
		{
			System.out.println("No next vowel");
		}
	}

}

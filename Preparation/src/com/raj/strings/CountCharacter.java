package com.raj.strings;

import java.util.Scanner;

public class CountCharacter 
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a String");
		String s1 = scn.nextLine();
		System.out.println("Enter Character to be Counted");
		String s2 = scn.next();
		String s3 = s1.replace(s2,"");
		int count = s1.length()-s3.length();
		System.out.println(s2+" = "+count);
	}

}

package com.raj.strings;

import java.util.Scanner;

public class CountString
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a String");
		String s1 = scn.next();
		System.out.println("Enter a string to be Counted");
		String s2 = scn.next();
		String s3 = s1.replace(s2, "");
		int count = s1.length()-s3.length();
		count = count/s2.length();
		System.out.println(s2+" = "+count);
	}

}

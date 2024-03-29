package com.raj.programs;

import java.util.Random;
import java.util.Scanner;

public class GenerateOtp 
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Your Mobile Number");
		String s = scn.next();
		if(s.length()<10)
		{
			System.out.println("Entered Mobile Number is Incorrect");
		}
		else
		{
			int len = 6;
			String num = "0123456789";
			Random random = new Random();
			char[] a  = new char[len];
			for(int i=0;i<len;i++)
			{
				a[i] = num.charAt(random.nextInt(num.length()));
			}
			String otpstr = new String(a);
			System.out.println(otpstr+" is Your 6 digit OTP");
		}
	}
}

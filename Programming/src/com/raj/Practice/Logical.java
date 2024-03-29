package com.raj.Practice;

import java.util.Scanner;

public class Logical 
{

	public static void main(String[] args) throws InterruptedException 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Assume Some Amount");
		int n = scn.nextInt();
		int d = n*2;
		System.out.println("Double Ur Assume Amount");	
		Thread.sleep(4000);
		//System.out.println(d+" is Ur Double Assume Amount");
		System.out.println("Ask Some Amount from Ur Friend");
		int f = scn.nextInt();
		int a = f+d;
		//System.out.println(a+" is Your Total Amount Now");
		System.out.println("Now u Remove Half Of Ur Total Money");
		int b = a/2;
	    Thread.sleep(5000);
		//System.out.println(b+" is Ur Current Amount");
		System.out.println("Now We Can Remove the Amount which you have Doubled Initially");
		int i = d-n;
		int t = f/2;
	    Thread.sleep(9000);
		System.out.println("Finally you have "+t+" Rupees is In ur Hand");
	}

}

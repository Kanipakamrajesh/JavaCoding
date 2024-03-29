package com.raj.Practice;

import java.util.Scanner;

public class Initialise 
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter The Size of an Array");
		int size = scn.nextInt();
		int[] a = new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter Element of the index"+i+" : ");
			a[i] = scn.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}

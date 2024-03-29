package com.raj.Practice;

import java.util.Scanner;

public class Update1 
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Size of an Array");
		int size = scn.nextInt();
		int[] a = new int[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter Element at the index "+i+" is:");
			a[i] = scn.nextInt();
		}
		for(int n:a)
		{
			System.out.println(n+" ");
		}
		System.out.println();
		System.out.println("Enter index to be Update");
		int index = scn.nextInt();
		System.out.println("Enter Value to be Update");
		int key = scn.nextInt();
		a[index] = key;
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}

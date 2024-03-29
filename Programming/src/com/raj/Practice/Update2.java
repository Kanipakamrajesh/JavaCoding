package com.raj.Practice;

import java.util.Scanner;

public class Update2 
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
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println("Enter which Value You want to Update");
		int key = scn.nextInt();
		System.out.println("Enter New Value to be Update");
		int key2 = scn.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				a[i] = key2;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}
}
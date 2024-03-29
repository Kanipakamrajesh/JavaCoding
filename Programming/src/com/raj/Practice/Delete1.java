package com.raj.Practice;

import java.util.Scanner;

public class Delete1 
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
		System.out.println(a.length);
		System.out.println("Enter Index Value to be Deleted ");
		int index = scn.nextInt();
		for(int i=index+1;i<a.length;i++)
		{
			a[i-1] = a[i];
		}
		int[] temp = new int[a.length-1];
		for(int i=0;i<a.length-1;i++)
		{
			temp[i] = a[i];
		}
		a = temp;
		for(int n:a)
		{
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println(a.length);
	}
}

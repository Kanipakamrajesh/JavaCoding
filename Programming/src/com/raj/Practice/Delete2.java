package com.raj.Practice;

import java.util.Scanner;

public class Delete2 
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
		System.out.println("a length is "+a.length);
		System.out.println("Enter Value to be Deleted ");
		int key = scn.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				for(int j=i+1;j<a.length;j++)
				{
					a[j-1] = a[j];
				}
			}
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
		System.out.println("a length is "+a.length);
	}

}

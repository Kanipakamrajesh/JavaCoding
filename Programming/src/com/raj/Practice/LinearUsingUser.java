package com.raj.Practice;

import java.util.Scanner;

public class LinearUsingUser
{

	public static void main(String[] args)
    {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size = scn.nextInt();
		int[] a = new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter Elements at index "+i);
			a[i] = scn.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Enter Number to be Search:");
		int key = scn.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(key==a[i])
			{
				System.out.println("Searched Key is Found at index "+i);
			}
			else
			{
				if(key==a[i])
				{
					System.out.println("Key is not found");
				}
			}
		}
	}

}

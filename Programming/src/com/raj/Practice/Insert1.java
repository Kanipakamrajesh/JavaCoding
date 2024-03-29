package com.raj.Practice;

import java.util.Scanner;

public class Insert1 
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Size of an Array");
		int size = scn.nextInt();
		int[] a = new int[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter Element at position "+i+" is:");
			a[i] = scn.nextInt();
		}
		for(int n:a)
		{
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println("a length is "+a.length);
        int[] temp = new int[a.length+1];
        for(int i=0;i<a.length;i++)
        {
        	temp[i] = a[i];
        }
        a = temp;
        System.out.println("Enter index number to be Insert");
        int index = scn.nextInt();
        System.out.println("Enter Element to be Inserted");
        int e = scn.nextInt();
        for(int i=a.length-1;i>=index;i--)
        {
        	a[i] = a[i-1];
        }
        a[index] = e;
        for(int i=0;i<a.length;i++)
        {
        	System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("a length is "+a.length);
	}

}

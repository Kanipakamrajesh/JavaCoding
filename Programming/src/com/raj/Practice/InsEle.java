package com.raj.Practice;

import java.util.Scanner;

public class InsEle 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Size of an Array");
		int size = scn.nextInt();
		int[] a = new int[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter an Element at the Position "+i+" is:");
			a[i] = scn.nextInt();
		}
		display(a);
		size(a);
		while(true)
		{
		System.out.println("Enter an Element");
	    int key = scn.nextInt();
	    int[] temp  = new int[a.length+1];
	    for(int i=0;i<a.length-1;i++)
	    {
	    	temp[i] = a[i];
	    }
	    a = temp;
	    for(int i=0;i<a.length;i++)
	    {
	    	
	        for(int j=a.length-1;j>i;j--)
	        {
	        	
	        }
	    }
	    display(a);
	    size(a);
	}
	}
	static void display(int[] a)
	{
		for(int n:a)
		{
			System.out.print(n+" ");
		}
		System.out.println();
	}
	static void size(int[] a)
	{
		int length = a.length;
		System.out.println(length);
	}
}

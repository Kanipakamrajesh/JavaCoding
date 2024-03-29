package com.raj.Practice;

import java.util.Scanner;

public class TwoDimension 
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter no of Rows");
		int r = scn.nextInt();
		System.out.println("Enter no of columns");
		int c = scn.nextInt();
		int[][] a = new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter Elements at position ["+i+"]["+j+"]:");
				a[i][j] = scn.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			
		}
	}

}

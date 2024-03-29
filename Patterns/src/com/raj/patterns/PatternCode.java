package com.raj.patterns;

public class PatternCode
{

	public static void main(String[] args) 
	{
    pattern6(5);
		
		
	}
	public static void pattern6(int n)
	{
		for(int row = 0; row<2 * n; row++)
			
		{
			int totalcolsinrow = row>n ? 2*n-row : row ;
			for(int col=0;col<totalcolsinrow;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void pattern5(int n)
	{
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n-row+1;col++)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	public static void pattern4(int n)
	{
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	public static void pattern3(int n)
	{
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n-row+1;col++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void pattern1(int n)
	{
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void pattern2(int n)
	{
		for(int row=0;row<n;row++)
		{
			for(int col=0;col<=row;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

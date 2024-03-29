package com.raj.Arrays;

public class MatrixMultiplication
{

	public static void main(String[] args)
	{
		int[][] a = {{1,2,3},{4,5,6},{1,4,1}};
		int[][] b = {{2,5,1},{1,6,3},{1,9,3}};
		display(a);
		display(b);
		int[][] c = multiply(a,b);
		display(c);
	}
	static void display(int[][] a)
	{
		for(int[] n:a)
		{
			for(int s:n)
			{
				System.out.print(s+" ");
			}
			System.out.println();
		}
		System.out.println("--------");
	}
	static int[][] multiply(int[][] a,int[][] b)
	{
		int len = a.length;
		int[][] c = new int[len][len];
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				for(int k=0;k<len;k++)
				{
					c[i][j] = c[i][j] + a[i][k] + b[k][j];		
				}
			}
		}
		return c;
	}

}

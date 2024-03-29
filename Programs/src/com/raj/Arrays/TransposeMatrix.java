package com.raj.Arrays;

public class TransposeMatrix 
{

	public static void main(String[] args)
	{
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		for(int[] n:a)
		{
			for(int k:n)
			{
			System.out.print(k+" ");
			}
			System.out.println();
		}
		System.out.println("-------");
		int[][] b = transpose(a);
		for(int[] n:b)
		{
			for(int s:n)
			{
				System.out.print(s+" ");
			}
			System.out.println();
		}
		
	}
	static int[][] transpose(int[][] a)
	{
		int[][] b = new int[a[0].length][a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				b[j][i] = a[i][j];
			}
		}
		return b;
	}

}

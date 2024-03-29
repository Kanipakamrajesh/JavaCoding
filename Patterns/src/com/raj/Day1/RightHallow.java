package com.raj.Day1;

public class RightHallow
{

	public static void main(String[] args)
	{
		int n = 7;
		int x = 1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=x;j++)
			{
				if(j==1 || j==x)
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
			if(i<=n/2)
			{
				x++;
			}
			else
			{
				x--;
			}
		}
	}

}

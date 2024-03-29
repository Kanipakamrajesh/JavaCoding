package com.raj.patterns;

import java.util.Scanner;

public class ParallelPattern 
{

	public static void main(String[] args) 
	{
      Scanner scn = new Scanner(System.in);
      System.out.println("Enter a Number :");
      int n = scn.nextInt();
      
      for(int i=1;i<=n;i++)
      {
    	  for(int j=1;j<=n;j++)
    	  {
    		  if(j==1 || j==n)
    			  System.out.print("* ");
    		  else 
    			  System.out.print("  ");
    	  }
    	  System.out.println();
      }
		
		
	}

}

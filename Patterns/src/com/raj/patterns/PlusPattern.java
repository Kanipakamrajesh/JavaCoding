package com.raj.patterns;

public class PlusPattern
{

	public static void main(String[] args)
	{
      int n = 12;
      for(int i=1;i<=12;i++)
      {
    	  for(int j=1;j<=12+1;j++)
    	  {
    		  if(i==n/2+1 || j==n/2+1)
    			  System.out.print("*"+" ");
    		  else
    			  System.out.print("  ");
    	  }
    	  System.out.println();
      }	
	}

}

package com.raj.Practice;

import java.util.Scanner;

public class HighestArmStrong
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter First Number");
		int m = scn.nextInt();
		System.out.println("Enter Second Number");
		int n = scn.nextInt();
		for(int i=n;i>=m;i--)
		{
			if(isArmstrong(i))
			{
			   System.out.println(i);
			   break;
			}
		}
		
	}
	static boolean isArmstrong(int m)
	{
	
	    int temp=m;
	    int count=0;
	    while(temp>0)
	    {
	    	count++;
	    	temp/=10;
	    }
	    //System.out.println("Leng of Number is:"+count);
	    temp=m;
	    int sum=0;
	    while(temp>0)
	    {
	    	int digit=temp%10;
	    	int prod=1;
	    	for(int i=1;i<=count;i++)
	    	{
	    		prod*=digit;
	    	}
	    	    sum+=prod;
	    		temp/=10;
	    	}
	    	//System.out.println("Sum ="+sum);
	    	return sum==m;
	    
	    	
	    }

	 
		
	 
	}




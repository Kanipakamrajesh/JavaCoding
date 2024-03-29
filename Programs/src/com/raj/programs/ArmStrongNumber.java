package com.raj.programs;
import java.util.Scanner;

public class ArmStrongNumber
{

	public static void main(String[] args)
	{
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter a Number: ");
    int n = scn.nextInt();
    int temp = n;
    int count = 0;
    while(n>0)
    {
    	count++;
    	n =  n/10;
    }
    System.out.println("count is "+ count);
    int sum = 0;
    n = temp;
    while(n>0)
    {
     int prod =  1;
     int digit = n%10;
     for(int i=1; i<=count;i++)
     {
    	 prod = prod*digit;
     }
     sum = sum+prod;
     System.out.println(digit +"Pow"+"="+prod);	
    }
    if(sum==n)
    {
    	System.out.println("Armstrong");
    	
    }
    else System.out.println("No");
		
		
	}

}

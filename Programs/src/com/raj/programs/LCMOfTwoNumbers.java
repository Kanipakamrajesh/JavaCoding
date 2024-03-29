package com.raj.programs;

import java.util.Scanner;

public class LCMOfTwoNumbers 
{

	public static void main(String[] args)
	{
     Scanner scn = new Scanner(System.in);
     System.out.println("Enter Two Numbers: ");
     int a = scn.nextInt();
     int b = scn.nextInt();
     int n =  a>b?a:b;
     while(true)
     {
    	 if(n%a==0 && n%b==0) break;
         n++;
     }
     System.out.println("LCM of" + a + "  and "+  b +" = "+n);
	
		
	}

}

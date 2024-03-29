package com.raj.programs;

import java.util.Scanner;

public class LoversAge {

	public static void main(String[] args)
	{
		
     Scanner scn = new Scanner(System.in);
     System.out.println("Enter Boy Age");
     int b = scn.nextInt();
     System.out.println("Enter Girl Age");
     int g =  scn.nextInt();
     if(b<g)System.out.println("Girl is Older than boy Don't Marry!");
     
     else if(b>=21 && g>=21)
     {
    	 System.out.println("Eligible for Marriage");
     }
     else System.out.println("Not Eligible for Marriage");
     
		
		
	}

}

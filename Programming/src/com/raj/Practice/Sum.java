package com.raj.Practice;

public class Sum 
{
	public static void main(String[] args) 
	{
	    int a = 5;  //Binary:0101
	    int b = 3;  //Binary:0011 
	    while(b!=0)
	    {
	    int carry =  a&b;           // Carry contains common set bits of  a and b                
	    a = a^b;                    // Sum of bits of a and  b where at least one of the bit is  not set         
	    b = carry<<1;               // Carry is shifted by one so that adding it to a gives the required sum
	    }                                   
	    System.out.println(a);
	}
}

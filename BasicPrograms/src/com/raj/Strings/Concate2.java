package com.raj.Strings;

public class Concate2 
{
     public static void main(String[] args) 
	{
    	 String s = "[1,2,1]";
    	        s = s.replace("[","");
    	        s = s.replace("]", "");
    	 String s2 = "";
    	 int sum1 = 0;
		 char[] a = s.toCharArray();
		 //System.out.println(a[0]);
		 //System.out.println(a[1]);
		 //System.out.println(a[2]);
		 sum1 =  a[0];
		 sum1 = sum1-'0';
		// System.out.println(sum1);
		 int sum2 = a[0]-'0' + a[2]-0;
		     sum2 = sum2-'0';
		    // sum2 = sum2 - '0';
		// System.out.println(sum2);
		 int sum3 = a[0]-'0' + a[2]-'0' + a[4]-'0';
		    // sum3 = sum3 - '0';
		// System.out.println(sum3);
		 s2 = "["+ sum1 + ","+sum2 +","+sum3+"]";
		 System.out.println(s2);
	}
}

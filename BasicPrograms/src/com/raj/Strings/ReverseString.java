package com.raj.Strings;

public class ReverseString
{

	public static void main(String[] args) 
	{
		String s = "Rajesh";
		//String s2 = "";
	    	//   s2 = s2 + rev(s);
	    System.out.println(rev(s));
	}	
		
		static String rev(String s)
		{
		char[] a = s.toCharArray();
		int i = 0, j = a.length-1;
		while(i<j)
		{
			char temp = a[i];
			     a[i] = a[j];
			     a[j] = temp;
			 i++;
			 j--;
		}
		//System.out.println(a);
		return new String(a);
	}

}
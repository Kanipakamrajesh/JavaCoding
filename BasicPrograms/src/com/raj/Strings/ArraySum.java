package com.raj.Strings;

import java.util.Arrays;

public class ArraySum 
{

	public static void main(String[] args) 
	{
		String s = "{1,2,3},{1,2,3,4}";
		String[] s2 = s.replace("{","").replace("}","").split(",");
	    int[] a = new int[3];
	    int[] b = new int[4];
	    for(int i=0;i<s2.length;i++)
	    {
	    	int val = Integer.parseInt(s2[i]);
	    	if(i<3)
	    	{
	    		a[i] = val;
	    	}
	    	else
	    	{
	    		b[i-3] = val;
	    	}
	    }
	    System.out.println(Arrays.toString(a));
	    System.out.println(Arrays.toString(b));
	    int l = (a.length)>(b.length)?(a.length):(b.length);
	    int[] c = new int[l];
	    for(int i=0;i<c.length;i++)
	    {
	    	if(i<a.length && i<b.length)
	    	{
	        c[i] = a[i]+b[i];
	        }
	    	else if(i>=a.length)
	        {
	    	c[i] = b[i];
	        }
	        else if(i>=b.length)
	        {
	        	c[i] = a[i];
	        }
	    }
	    System.out.println(Arrays.toString(c));
	}

}

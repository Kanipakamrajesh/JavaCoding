package com.raj.Strings;

public class Concate
{

	public static void main(String[] args) 
	{
		String s = "[1,2,1]";
		       s = s.replace("[","");
		       s = s.replace("]","");
		String s2 = "";
		       s2 = "["+s+","+s+"]";
		System.out.println(s2);
	}

}

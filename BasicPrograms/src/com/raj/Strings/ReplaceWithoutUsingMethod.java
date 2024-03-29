package com.raj.Strings;

public class ReplaceWithoutUsingMethod 
{
	public static void main(String[] args) 
	{
		String s = "rajeshk";
		int pos = 6;
		char rep = 'u';
		String s2 = s.substring(0,pos)+rep+s.substring(pos+1);
		System.out.println(s2);
	}

}

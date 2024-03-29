package com.raj.Strings;

public class Rotation 
{

	public static void main(String[] args) 
	{
		String s1 = "abcd";
		String s2 = "dcba";
		if(s1.length()!=s2.length())
		{
			System.out.println("Not Rotaion");
			return;
		}
		else
		{
			String s3 = s1 + s2;
			if(s3.contains(s1))
			{
				System.out.println("Rotation");
			}
			else
			{
				System.out.println("Not Rotation");
			}
			
		}
		
	}

}

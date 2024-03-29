package com.raj.Strings;
public class EachWordCapital
{

	public static void main(String[] args) 
	{
		String s = "my name is rajesh";
		String[] arr = s.split(" ");
		String s2 = "";
		for(int i=0;i<arr.length;i++)
		{
			char c = arr[i].charAt(0);
			String s3 = String.valueOf(c).toUpperCase();
			String sub = arr[i].substring(1);
			s2 = s2 + s3 + sub +" ";
			
		}
		s2 = s2.trim();
		System.out.println(s2);
	}

}

package com.raj.strings;

public class RemoveDuplicateWord 
{

	public static void main(String[] args)
	{
		String s = "java is an simple java is an easy";
		String[] arr = s.split(" ");
		String s2 = "";
		for(String str:arr)
		{
			if(s2.indexOf(str)==-1) 
			{
			s2 = s2 + str;
			s2 = s2 + " ";
		    }
		}
		System.out.println(s2);
	}

}

package com.raj.Strings;

public class CountNumberOfCharacter
{

	public static void main(String[] args) 
	{
		String s = "java developer";
		int count = 0;
		//       s = s.replace(" ","");
		char[] a = s.toCharArray();
		for(char c:a)
		{
			if(!(c==' ')) 
			count++;
		}
		System.out.println(count);
	}

}

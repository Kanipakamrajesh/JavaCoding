package com.raj.Strings;

import java.util.Arrays;

public class Split {

	public static void main(String[] args)
	{
		String s = "java is an oop lang";
		int count = 0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				count++;
			}
		}
		String[] arr = new String[count+1];
		int pos = 0;
		String s2 = "";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch!=' ')
			{
				s2 = s2 + ch;
			}
			else
			{
				arr[pos++] = s2;
				s2 = "";
			}
			arr[pos] = s2;
			//arr[arr.length-1] = s2;
		}
		//System.out.println(Arrays.toString(arr));
		String s3 = "[" + arr[0];
		for(int i=1;i<arr.length;i++)
		{
			s3 = s3 + "," + arr[i];
		}
		s3 = s3 + "]";
		System.out.println(s3);
	}

}

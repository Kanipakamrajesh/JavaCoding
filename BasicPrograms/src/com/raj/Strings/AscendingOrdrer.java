package com.raj.Strings;

import java.util.Arrays;

public class AscendingOrdrer 
{

	public static void main(String[] args)
	{
		String s = "India is my Country";
		String[] arr = s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].length()>arr[j].length())
				{
					String temp = arr[i];
					      arr[i] = arr[j];
					      arr[j] = temp;
				}
				else if(arr[i].length()==arr[j].length())
				{
					if(arr[i].compareTo(arr[j])>0)
					{
						String temp = arr[i];
						     arr[i] = arr[j];
						     arr[j] = temp;
					}
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}

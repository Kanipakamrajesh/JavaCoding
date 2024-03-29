package com.raj.Strings;

public class RepeatedWordsInString 
{

	public static void main(String[] args) 
	{
		String s = "i am rajesh i am bad boy";
		String[] arr = s.split(" ");
		int count = 0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					String s2 = arr[i];
					System.out.println(s2);
					count++;
				    break;
				}
			}
		}
		System.out.println(count);
	}

}

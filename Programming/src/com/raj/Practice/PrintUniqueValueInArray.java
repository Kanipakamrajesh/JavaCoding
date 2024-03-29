package com.raj.Practice;

public class PrintUniqueValueInArray 
{

	public static void main(String[] args) 
	{
		String[] s1 = {"Rajesh","Mouni","ramu","prakash"};
		String[] s2 = {"ramu","Rajesh","Mouni","Naresh","Anil"};
		String[] s3 = new String[s1.length+s2.length];
		int index = 0;
		
		for(int i=0;i<s1.length;i++)
		{
			s3[index] = s1[i];
			index++;
		}
		for(int i=0;i<s2.length;i++)
		{
			s3[index] = s2[i];
			index++;
		}
		for(int i=0;i<s3.length;i++)
		{
			if(s3[i]==null)
			{
				continue;
			}
			for(int j=i+1;j<s3.length;j++)
			{
				if(s3[i]!=s3[j])
				{
					s3[i] = null;
				}
			}
		}
		for(int i=0;i<s3.length;i++)
		{
			if(s3[i]!=null)
			{
				System.out.println(s3[i]);
			}
		}
	}

}

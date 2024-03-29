package com.raj.Strings;

public class PenagramOrNot 
{

	public static void main(String[] args) 
	{
		String s = "The quick brown fox jumps over the lazy dog";
		System.out.println(isPanagram(s));
	}
	static boolean isPanagram(String s)
	{
		boolean[] a = new boolean[26];
		s = s.toLowerCase();
		
		for(int i=1;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z')
			{
				a[ch-'a']=true;
			}
		}
		for(int i=1;i<26;i++)
		{
			if(!a[i])
			{
				return false;
			}
		}
		return true;
	}

}

package com.raj.Strings;

public class ReverseToggle 
{
	public static void main(String[] args)
	{
		String s = "my name is khan";
		String[] arr = s.split(" ");
		String s2 = "";
		for(String str:arr)
		{
			s2 = s2 + rev(str);
			s2 = toggle(s2);
			s2 = s2 + " ";
		}
		s2 = s2.trim();
		System.out.println(s2);
	}
	static String toggle(String s)
	{
		char[] a = s.toCharArray();
		String s2 = "";
		for(char c:a)
		{
			if(c>='a'&&c<='z')
			{
				s2 = s2 + Character.toUpperCase(c);
			}
			else if(c>='A'&&c<='Z')
			{
				s2 = s2 + Character.toLowerCase(c);
			}
			else
			{
				s2 = s2 + c;
			}
		}
		return s2;
	}
	static String rev(String s)
	{
		char[] a = s.toCharArray();
		int i = 0,j = a.length-1;
		while(i<j)
		{
			char temp = a[i];
			    a[i] = a[j];
			    a[j] = temp;
			    i++;
			    j--;
		}
		return new String(a);
	}

}

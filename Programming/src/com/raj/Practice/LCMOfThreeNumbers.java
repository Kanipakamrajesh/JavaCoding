package com.raj.Practice;

public class LCMOfThreeNumbers
{

	public static void main(String[] args)
	{
		int a,b,c;
		a = 2;
		b = 3;
		c = 7;
		int n = (a>b)?(a>c?a:c):(b>c?b:c);
		while(true)
		{
			if(n%a==0 && n%b==0 && n%c==0)
			{
				break;
			
			}
			n++;
		}
		System.out.println(n);
		Object s = "HI";
		System.out.println(s);
	}

}

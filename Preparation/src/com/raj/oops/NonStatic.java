package com.raj.oops;

class D
{
	int i;
	public void m1()
	{
		System.out.println(i);
	}
}
public class NonStatic
{

	public static void main(String[] args)
	{
		D d = new D();
		System.out.println(d.i);
		d.i = 10;
		d.m1();
		D d2 = new D();
		d2.i = 99;
		d2.m1();
		d.m1();
		
	}

}

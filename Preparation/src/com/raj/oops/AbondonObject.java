package com.raj.oops;
class E
{
	int i;
	public void m1()
	{
		System.out.println(i);
	}
}
public class AbondonObject
{
	public static void main(String[] args)
	{
		E e1 = new E();
	    e1.m1();
	    e1.i = 100;
	    e1.m1();
	    e1 = new E();
	    e1.m1();
	}

}

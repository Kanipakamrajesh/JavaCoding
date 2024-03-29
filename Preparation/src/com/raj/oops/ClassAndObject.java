package com.raj.oops;

class A
{
	static int i=10;
	static void m1()
	{
		System.out.println("m1 in class A");
	}
}
class B
{
	static int i;
	void m1()
	{
		System.out.println("m1 in class B");
	}
}
public class ClassAndObject 
{
	public static void main(String[] args) 
	{
		A a = new A();
		A.m1();
		B b = new B();
		System.out.println(b.i);
		A.i = 20;
		System.out.println(a.i);
		b.m1();
		A.m1();
	}

}

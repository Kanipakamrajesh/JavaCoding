package com.raj.oops;

class C
{
    static int  i;
}
public class Static
{
    static int i;
    int j;
	public static void main(String[] args) 
	{
		C c1 = new C();
		C c2 = new C();
		C c3 = new C();
		System.out.println(c1.i);
		System.out.println(c2.i);
		System.out.println(c3.i);
		c2.i = 15;
		System.out.println(c1.i);
		System.out.println(c2.i);
		System.out.println(c3.i);
		System.out.println(i);
		Static s = new Static();
		System.out.println(s.j);
		
	}

}

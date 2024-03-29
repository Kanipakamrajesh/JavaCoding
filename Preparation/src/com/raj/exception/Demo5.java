package com.raj.exception;

class A extends Exception
{
	
}
public class Demo5
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		try {
			m1();
		} catch (A e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Handled");
		}
		
	}
	static void m1() throws A
	{
		System.out.println("m1 starts");
		throw new A();
	}

}

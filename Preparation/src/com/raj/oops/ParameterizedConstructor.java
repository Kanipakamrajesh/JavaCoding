package com.raj.oops;

class I
{
	int i;
	int j;
	I(int a,int b)
	{
		i = a;
		j = b;
	}
	void display()
	{
		System.out.println(i+" "+j);
	}
}
public class ParameterizedConstructor {

	public static void main(String[] args) 
	{
		I i = new I(10,20);
		i.display();
	}

}

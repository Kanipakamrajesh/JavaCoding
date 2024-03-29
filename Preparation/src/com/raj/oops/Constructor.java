package com.raj.oops;

class H
{
	int i;
	int j;
	public H()
	{
		i = 10;
		j = 20;
	}
	public void display()
	{
		System.out.println(i+" "+j);
	}
}
public class Constructor
{
    public static void main(String[] args) 
	{
    	H h = new H();
    	System.out.println(h.i);
    	System.out.println(h.j);
    	H h2 = new H();
    	h2.display();
	}

}

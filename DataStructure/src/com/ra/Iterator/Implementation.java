package com.ra.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Implementation
{

	public static void main(String[] args) 
	{
		Collection c = new LinkedList();
		c.add("Rajesh");
		c.add("Mouni");
		c.add("Prakash");
		c.add("Naresh");
		c.add("Dhoni");
		Iterator i = c.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}

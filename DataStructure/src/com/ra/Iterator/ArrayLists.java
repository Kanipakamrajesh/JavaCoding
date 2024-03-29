package com.ra.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists 
{

	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		Iterator i =  a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}

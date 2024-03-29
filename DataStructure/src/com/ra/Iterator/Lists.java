package com.ra.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lists
{

	public static void main(String[] args) 
	{
		List l = new ArrayList();
		l.add(60);
		l.add(50);
		l.add(40);
		l.add(30);
		l.add(20);
		l.add(70);
		l.add(10);
		ListIterator i = l.listIterator();
		System.out.println(i.nextIndex());
		System.out.println(i.previousIndex());
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("-----------------");
		while(i.hasPrevious())
		{
			System.out.println(i.previous());
		}
		System.out.println("-----------------");
		l.set(2,100);
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}

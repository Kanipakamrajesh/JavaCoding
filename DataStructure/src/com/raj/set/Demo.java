package com.raj.set;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Demo
{

	public static void main(String[] args)
	{
		SortedSet s = new TreeSet();
		s.add(40);
		s.add(20);
		s.add(70);
		s.add(50);
		s.add(68);
		s.add(34);
		s.add(34);
		s.add(49);
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.size());
		SortedSet s1 = s.headSet(40);
		display(s1);
		SortedSet s2 = s.tailSet(40);
		display(s2);
		SortedSet s3 = s.subSet(40, 68);
		display(s3);
		
	}
	static void display(Set s)
	{
		for(Object o:s)
		{
			System.out.print(o+"  ");
		}
		System.out.println();
	}

}

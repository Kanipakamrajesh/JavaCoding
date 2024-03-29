package com.raj.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Driver
{

	public static void main(String[] args)
    {
		List<Mobile> mlist = new ArrayList<>();
		mlist.add(new Mobile(1,"Apple",10000));
		mlist.add(new Mobile(2,"Nokia",20000));
		mlist.add(new Mobile(3,"Lemon",10000));
		mlist.add(new Mobile(4,"Smasung",10000));
		mlist.add(new Mobile(5,"Redmi",10000));
		mlist.add(new Mobile(6,"Vivo",10000));
		mlist.add(new Mobile(7,"Jio",10000));

		Comparator<Mobile> com = (e1,e2)->
		{
			return e1.getBrand().compareToIgnoreCase(e2.getBrand());
		};
    
		Collections.sort(mlist,com);		
		
		for(Mobile c:mlist)
		{
			System.out.println(c);
		}

	}

}

package com.raj.Map;

import java.util.HashMap;
import java.util.Map;

public class Implementation 
{
	public static void main(String[] args)
	{
		Map m = new HashMap();
		System.out.println(m.put("a",1));
		System.out.println(m.put("b",2));
		System.out.println(m.put("a",3));
		System.out.println(m.put("b",4));
		System.out.println("Size="+m.size());
		System.out.println(m.get("a"));
		System.out.println(m.get("b"));
	}

}

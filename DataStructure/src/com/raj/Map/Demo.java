package com.raj.Map;
import java.util.*;

public class Demo
{

	public static void main(String[] args)
	{
		Map h = new HashMap();
		Map t = new TreeMap();
		Map l = new LinkedHashMap();
		h.put("maths",97);
		h.put("Telugu",98);
		h.put("Science",67);
		t.put("maths",97);
		t.put("Telugu",98);
		t.put("Science",67);
		l.put("maths",97);
		l.put("Telugu",98);
		l.put("Science",67);
		Set s = h.keySet();
		Iterator i = s.iterator();
		while(i.hasNext())
		{
			Object key = i.next();
			Object value = h.get(key);
			System.out.println(key+" "+value);
		}
	}

}

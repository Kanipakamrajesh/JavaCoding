package com.jsp.ArrayList;

public class Demo
{

	public static void main(String[] args) 
	{
    ArrayList l = new ArrayList();
    System.out.println("size="+l.size());
    l.add(10); 
    l.add(20);
    l.add(30);
    l.add(40);
    l.add(50);
    l.add(2,60);
    System.out.println(l.toString());
    l.remove(3);
    
    for(int i=0;i<l.size();i++)
    {
    	System.out.println(l.get(i));
    }
    System.out.println(l.toString());
    
    System.out.println("size="+l.size());
	}

}

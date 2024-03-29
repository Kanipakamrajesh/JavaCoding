package com.raj.SingleLinkedList;

public class Demo
{

	public static void main(String[] args)
	{
    SingleLinkedList l = new SingleLinkedList();
    l.add(10);
    l.add(20);
    l.add(30);
    l.add(40);
    l.add(2,60);
    l.remove(3);
    
    for(int i=0;i<l.size();i++)
    {
    	System.out.println(l.get(i));
    }
    System.out.println(l.toString());
    l.clear();
    System.out.println(l.toString());
		
		
	}

}

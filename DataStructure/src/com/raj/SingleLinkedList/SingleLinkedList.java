package com.raj.SingleLinkedList;

public class SingleLinkedList
{
	private Node first = null;
	private Node last = first;
	private int count = 0;
	public void add(Object e)
	{
		if(first==null)
		{
			first = new Node(e,null);
			count++;
			return;
		}
	    last = first;
		while(last.next!=null)
		{
			last = last.next;
		}
		last.next = new Node(e,null);
		count++;
	}
	public int size()
	{
		return count;
	}
	public Object get(int index)
	{
		if(index<=-1 || index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		Node curr = first;
		for(int i=1;i<=index;i++)
		{
			curr = curr.next;
		}
		return curr.ele;
	}
	public void add(int index,Object e)
	{
		if(index<=-1 || index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		if(index==0)
		{
			first = new Node(e,first);
			count++;
			return;
		}
		Node curr = first;
		for(int i=1;i<index;i++)
		{
			curr = curr.next;
		}
		curr.next = new Node(e,curr.next);
		count++;
	}
	public  String toString()
	{
		if(first==null) return "[]";
		String s = "["+first.ele;
		Node curr = first;
		while(curr.next!=null)
		{
			curr = curr.next;
			s = s+","+curr.ele;
		}
		s = s+"]";
		return s;
	}
	public void remove(int index)
	{
		if(index<=-1 || index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		if(index==0)
		{
			first = first.next;
			count--;
			return;
		}
		Node curr = first;
		for(int i=1;i<index;i++)
		{
			curr = curr.next;
		}
		Node rem = curr.next;
		Node next = rem.next;
		curr.next = next;
		if(index==size()-1)
		{
        last = curr;
		
		}
		count--;
	}
	public void clear()
	{
		 first = null;
		 last = null;
		 count = 0;
	}
	
	
	

}






















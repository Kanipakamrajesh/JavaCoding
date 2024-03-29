package com.raj.LinkedList;

class Node
{
	Object ele;
	Node next;
	Node(Object e,Node n)
	{
		ele = e;
		next = n;
	}
}
class LinkedList
{
	private Node first = null;
	private int count = 0;
	public void add(Object e)
	{
		if(first==null)
		{
			first = new Node(e,null);
			count++;
			return;
		}
		Node last = first;
		while(last.next!=null)
		{
			last = last.next;
		}
		last.next = new Node(e,null);
		count++;
	}
	public void  add(int index,Object e)
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
		curr.next = curr.next.next;
		if(index==size()-1)
		{
		    Node last = curr;
		}
		count--;
	}
	public String toString()
	{
		if(size()==0)
		{
			return "[]";
		}
		String s = "["+first.ele;
		Node curr = first;
		while(curr.next!=null)
		{
			curr = curr.next;
			s = s + ","+curr.ele;
		}
		s = s+"]";
		return s;
	}
	public void  clear()
	{
	    Node first = null;
	    Node last = null;
	    count = 0;
	}
}

public class Demo 
{

	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		System.out.println(l);
		System.out.println(l.size());
		l.add(3,80);
		System.out.println(l.size());
		l.remove(5);
		System.out.println(l);
		System.out.println(l.size());
		l.add("Rajesh");
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.get(5));
		l.remove(7);
		System.out.println(l);
		//l.clear();
		//System.out.println(l);
	}

}

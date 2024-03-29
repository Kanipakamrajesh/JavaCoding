package com.raj.Stackimplementation;

import java.util.EmptyStackException;

class Node
{
	Object ele;
	Node next;
	Node(Object e,Node n)
	{
		ele = e;
		next  = n;
	}
}

class Stack
{
	private Node first = null;
	private int count = 0;
	public void push(Object e)
	{
		if(first==null)
		{
			first = new Node(e,null);
			count++;
			return;
		}
		first = new Node(e,first);
		count++;
	}
	public Object pop()
	{
		if(isEmpty()) throw new EmptyStackException();
		Object ele = first.ele;
		first = first.next;
		count--;
		return ele;
	}
	public Object peek()
	{
		if(isEmpty()) throw new EmptyStackException();
		return first.ele;
	}
	public  int size()
	{
		return count;
	}
	public boolean isEmpty()
	{
		if(size()==0) return true;
		return false;
	}
}

public class Demo
{

	public static void main(String[] args) 
	{
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s.size());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.size());
	}

}

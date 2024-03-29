package com.raj.HashingObject;

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

class HashSetObject
{
	private Node[] a = new Node[10];
	int count = 0;
	public boolean  add(Object e)
	{
		int index = e.hashCode()%10;
		if(a[index]==null)
		{
			a[index] = new Node(e,null);
			count++;
			return true;
		}
		Node prev = null;
		Node curr = a[index];
		while(curr!=null)
		{
			if(e.equals(curr.ele)) return false;
			prev = curr;
			curr = curr.next;
		}
		prev.next = new Node(e,null);
		count++;
		return true;
	}
	void display()
	{
		for(int i=0;i<a.length;i++)
		{
			Node curr = a[i];
			while(curr!=null)
			{
				System.out.println(curr.ele);
				curr = curr.next;
			}
		}
	}
}

public class Demo2
{

	public static void main(String[] args)
	{
		HashSetObject h = new HashSetObject();
		System.out.println(h.add("java"));
		System.out.println(h.add("C"));
		System.out.println(h.add("Python"));
		System.out.println(h.add("Python"));
	    System.out.println(h.add("html"));
	    h.display();
	}

}

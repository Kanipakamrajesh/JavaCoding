package com.raj.HasingInt;


class Node
{
	int key;
	Node next;
	Node(int k,Node n)
	{
		key = k;
        next = n;
	}
}

class HashSet
{
	private Node[] a = new Node[10];
	int count = 0;
	public boolean add(int k)
	{
		int index = k%10;
		if(a[index]==null)
		{
			a[index] = new Node(k,null);
			count++;
			return true;
		}
		Node prev = null;
		Node curr = a[index];
		while(curr!=null)
		{
			if(k==curr.key) return false;
			prev = curr;
			curr = curr.next;
		}
		prev.next = new Node(k,null);
		count++;
		return true;
	}
	public void display()
	{
		for(int i=0;i<a.length;i++) 
		{
			Node curr = a[i];
			while(curr!=null)
			{
				System.out.println(curr.key);
				curr = curr.next;
			}
		}
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet h = new HashSet();
		System.out.println(h.add(10));
		System.out.println(h.add(22));
		System.out.println(h.add(33));
		System.out.println(h.add(44));
		System.out.println(h.add(55));
		System.out.println(h.add(66));
		System.out.println(h.add(77));
		System.out.println(h.add(88));
		System.out.println(h.add(99));
		System.out.println(h.add(65));
		System.out.println(h.add(74));
		System.out.println(h.add(55));
		h.display();

	}

}

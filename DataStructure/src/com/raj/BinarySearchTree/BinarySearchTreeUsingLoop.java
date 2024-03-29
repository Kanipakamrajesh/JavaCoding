package com.raj.BinarySearchTree;

class Node
{
	int key;
	Node left;
	Node right;
	Node(int k)
	{
		key = k;
		
	}
	Node(int k,Node l,Node r)
	{
		key = k;
		left = l;
		right = r;
	}
}

class BinarySearch
{
   // Queue q = new LinkedList();
	private Node root = null;
	private int count = 0;
    public void add(int k)
	{
		if(root==null)
		{
			root = new Node(k);
			count++;
			return;
		}
		Node curr = root;
		Node prev = null;
		while(curr!=null)
		{
			if(k<curr.key)
			{
				prev = curr;
				curr = curr.left;
			}
			else if(k>curr.key) 
			{
				prev = curr;
				curr = curr.right;
			}
			else
			{
				return;
			}
		}
			if(k<prev.key) prev.left = new Node(k);
			else  prev.right = new Node(k);
			count++;
		}
	
	public int size()
	{
		return count;
	}
    public Object get() 
	{
    	if(root==null) return null;
    	return root.key;
	}
}

public class BinarySearchTreeUsingLoop 
{

	public static void main(String[] args)
	{
		BinarySearch b = new BinarySearch();
	    b.add(50);
		b.add(25);
		b.add(75);
		b.add(10);
	    b.add(40);
//		b.add(60);
//		b.add(100);
		System.out.println(b.size());
		System.out.println(b.get());
	}

}

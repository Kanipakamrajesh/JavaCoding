package com.raj.BinarySearchTreeImple;

import java.util.LinkedList;
import java.util.Queue;

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

class BinarySearchTree
{
	private Node root = null;
	private int count = 0;
	public void add(int k)
	{
		if(root==null)
		{
			root = new Node(k);
			count++;
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
				prev =  curr;
				curr = curr.right;
			}
			else 
			{
				return;
			}
		}
		if(k<prev.key) prev.left = new Node(k);
		else prev.right = new Node(k);
		count++;

	}
	public int size()
	{
		return count;
	}
	public void levelOrder()
	{
		Queue<Node> q = new LinkedList<Node>();
		if(root!=null) q.add(root);
		while(!q.isEmpty())
		{
			Node n = q.poll();
			System.out.print(n.key+" ");
			if(n.left!=null) q.add(n.left);
			if(n.right!=null) q.add(n.right);
		}
		System.out.println();
	}
	public void preOrder()
	{
		pre(root);
		System.out.println();
	}
	private void pre(Node n)
	{
		if(n==null) return;
		System.out.print(n.key+" ");
		pre(n.left);
		pre(n.right);
	}
	public void postOder()
	{
		post(root);
		System.out.println();
	}
	private void post(Node n)
	{
		if(n==null) return;
		post(n.left);
		post(n.right);
		System.out.print(n.key+" ");
	}
	public void inOrder()
	{
		in(root);
		System.out.println();
	}
	public void in(Node n)
	{
		if(n==null) return;
		in(n.left);
		System.out.print(n.key+" ");
		in(n.right);
	}
}

public class Demo 
{

	public static void main(String[] args)
	{
		BinarySearchTree b = new BinarySearchTree();
		b.add(50);
		b.add(25);
		b.add(75);
		b.add(10);
		b.add(40);
		b.add(60);
		b.add(100);
		System.out.println(b.size());
		b.levelOrder();
		b.preOrder();
		b.postOder();
		b.inOrder();
	}

}

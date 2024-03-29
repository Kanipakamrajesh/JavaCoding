package com.raj.HashingStudent;

class Node
{
    Object ele;
	Node next;
	Node(Object k,Node n)
	{
		ele = k;
		next = n;
	}
}

class Student
{
	String name;
	int marks;
	Student(String n,int m)
	{
		name = n;
		marks = m;
	}
	public String toString()
	{
		return "Student[Name="+name+", marks= "+marks+"]";
	}
	public int hashcode()
	{
		return marks;
	}
	public boolean equals(Object o)
	{
		if(!(o instanceof Student)) return false;
		Student s = (Student)o;
		return name.equals(s.name) && marks == s.marks;
	}
}

class Hashset
{
	private Node[] a = new Node[10];
	int count = 0;
	public boolean add(Student k)
	{
		int index = k.hashcode()%10;
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
			if(k.equals(curr.ele)) return false;
			prev = curr;
			curr = curr.next;
		}
		prev.next =  new Node(k,null);
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
				System.out.println(curr.ele);
				curr = curr.next;
			}
		}
	}
}

public class Demo
{

	public static void main(String[] args)
	{
		Student s1 = new Student("rajesh",78);
		Student s2 = new Student("Mouni",78);
		System.out.println("hashcode of s1 = "+s1.hashcode());
		System.out.println("hascode of s2 = "+s2.hashcode());
		Hashset s = new Hashset();
		System.out.println(s.add(s1));
		System.out.println(s.add(s2));
	}

}

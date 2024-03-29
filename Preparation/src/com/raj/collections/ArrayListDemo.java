package com.raj.collections;
class ArrayList
{
	private Object[] a = new Object[5];
	private int pos = 0;
	public void add(Object e)
	{
		if(size()>=a.length) increase();
		a[pos++] = e;
	}
	private void increase()
	{
		Object[] temp = new Object[a.length+3];
		for(int i=0;i<a.length;i++)
		{
			temp[i] = a[i];
		}
		a = temp;
	}
	public void add(int index,Object e)
	{
		if(index<=-1 ||  index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		if(size()<=a.length) increase();
		for(int i=size()-1;i>=index;i--)
		{
			a[i+1] = a[i];
		}
		a[index] = e;
		pos++;
	}
	public void remove(int index)
	{
		if(index<=-1 || index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		for(int i=index+1;i<size();i++)
		{
			a[i-1] = a[i];
		}
		pos--;
		a[pos] = null;
	}
	public Object get(int index)
	{
		if(index<=-1 || index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		return a[index];
	}
	public String toString()
	{
		if(size()==0) return "[]";
		String s = "["+a[0];
		for(int i=1;i<size();i++)
		{
			s = s + ","+a[i];
		}
		s = s+"]";
		return s;
	}
	public int size()
	{
		return pos;
	}
}
public class ArrayListDemo
{
	public static void main(String[] args)
	{
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		System.out.println(a.size());
		System.out.println(a.toString());
		a.remove(3);
		System.out.println(a.size());
		System.out.println(a.toString());
		a.add(2,70);
		System.out.println(a.size());
		System.out.println(a.toString());
	}
}

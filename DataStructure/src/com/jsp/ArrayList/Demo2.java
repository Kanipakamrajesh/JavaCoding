package com.jsp.ArrayList;

class ArrayList1
{
	private Object[] a = new Object[5];
	private int pos = 0;
	public void add(Object e)
	{
		if(pos>=a.length) increase();
		a[pos] = e;
		pos++;
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
	public int size()
	{
		return pos;
	}
	public Object get(int index)
	{
		if(index<=-1 || index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		return a[index];
	}
	public void add(int index,Object e)
	{
		if(index<=-1 || index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		if(pos>=a.length) increase();
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
	public String toString()
	{
		if(size()==0) return "[]";
		String s = "["+a[0];
		for(int i=1;i<=size();i++)
		{
			s = s+","+a[i];
		}
		s = s+"]";
		return s;
	}
}

public class Demo2 
{

	public static void main(String[] args) 
	{
		ArrayList1 a1 = new ArrayList1();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		a1.add(60);
		a1.add(70);
		a1.add(80);
		a1.add(90);
		a1.add(100);
		a1.add(110);
		a1.add(2,60);
		System.out.println(a1);
		System.out.println(a1.size());
		a1.remove(2);
		//System.out.println(a1.get(2));
		System.out.println(a1);
		System.out.println(a1.size());
	}

}

package com.raj.Stack;

public class Demo
{

	public static void main(String[] args) 
	{
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.size());
	}

}
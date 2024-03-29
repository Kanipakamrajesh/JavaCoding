package com.raj.multithreading;

class Numbers extends Thread
{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		for(int i=1;i<=26;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		    System.out.println(i);
		}
	}
	
}
class Alphabets implements Runnable
{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		for(char c='a';c<='z';c++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(c);
		}
	}
	
}
public class Demo2 
{

	public static void main(String[] args) 
	{
		Thread t1 = new Numbers();
		t1.start();
		Alphabets a = new Alphabets();
		Thread t2 = new Thread(a);
		t2.start();
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}

}

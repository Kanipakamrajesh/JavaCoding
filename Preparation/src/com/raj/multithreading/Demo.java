package com.raj.multithreading;

class MyThread extends Thread
{
	@Override
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Hi Hello");
		}
	}
}
public class Demo 
{
	public static void main(String[] args) 
	{
		MyThread t = new MyThread();
		t.start();
		for(int i=1;i<=3;i++)
		{
			try {
				Thread.sleep(6000);
			}   catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			System.out.println("Hello Hi");
		}
		}
		
	}
}



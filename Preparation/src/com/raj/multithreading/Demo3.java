package com.raj.multithreading;

class Th extends Thread
{
	static Thread m;
	public void run()
	{
		try {
			m.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Demo3 
{
	public static void main(String[] args) 
	{
		Th t = new Th();
		Th m = new Th();
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=65;i<=75;i++)
		{
			System.out.println((char)i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}

package com.raj.multithreading;

class My implements Runnable
{
	@Override
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Child Thread");
		}
	}
}
public class Test
{
	public static void main(String[] args)
	{
		My t = new My();
		Thread t1 = new Thread(t);
		t1.start();
		for(int i=2;i<=4;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Main Thread");
		}
	}

}

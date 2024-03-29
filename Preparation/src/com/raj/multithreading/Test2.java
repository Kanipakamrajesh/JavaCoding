package com.raj.multithreading;

class Printing
{
	public static synchronized void wish(String s)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Good Morning "+s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Th1 extends Thread
{
	Printing p;
	String s;
	public Th1(Printing p,String s)
	{
		this.p = p;
		this.s = s;
	}
	@Override
	public void run()
	{
		p.wish(s);
	}
}
public class Test2
{
	public static void main(String[] args)
	{
		Printing p = new Printing();
		Printing p1 = new Printing();
		Th1 t1 = new Th1(p,"Raj");
		Th1 t2 = new Th1(p1,"Rajesh");
		t1.start();
		t2.start();

	}

}

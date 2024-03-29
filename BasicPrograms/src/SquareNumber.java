import java.util.Scanner;

public class SquareNumber 
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number");
		long n = scn.nextLong();
		long temp = 1;
		long res = 0;
		String s = "";
		s = s+n;
		System.out.println(s.length());
		while(n>0)
		{
			if(s.length()<10)
			{
				long rem = n%10;
				temp = rem*rem;
				if(temp<10)
				{
					res = res*10+temp;
					temp = 1;
				}
				else
				{
					res = res*100+temp;
					temp = 1;
				}
			}
			else
			{
				long rem = n%100;
				temp = rem*rem;
				if(temp<1000)
				{
					res = res*100+temp;
					temp = 1;
				}
				else
				{
					res = res*1000+temp;
					temp = 1;
				}
			}
			n = n/10;
		}
		System.out.println(1345678910%100);
	}

}

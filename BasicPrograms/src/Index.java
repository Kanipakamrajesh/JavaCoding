import java.util.Arrays;
import java.util.Scanner;

public class Index 
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = scn.nextLine();
		char[] a = s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length-1;j++)
			{
			if(a[i]==a[j])
			{
				System.out.println(0);
				break;
			}
			else
			{
				System.out.println(-1);
				break;
			}
			}
		}
		
	}	
}
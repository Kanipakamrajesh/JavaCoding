import java.util.Arrays;
import java.util.Scanner;

public class Anagram 
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter First String");
		String s1 = scn.nextLine();
		System.out.println("Enter Second String");
		String s2 = scn.nextLine();
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		if(s1.length()==s2.length())
		{
			char[] a1 = s1.toCharArray();
			char[] a2 = s2.toCharArray();
			Arrays.sort(a1);
			Arrays.sort(a2);
			boolean res = Arrays.equals(a1, a2);
			if(res)
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not Anagram");
			}
		}
		else
		{
			System.out.println("Enter Proper String");
		}
	}
}

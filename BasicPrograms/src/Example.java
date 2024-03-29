class Mtca
{
	static String principal = "Prabhakar Naidu";
	static String college = "Mother Theresa";
	static String loc = "Palamaner";
	String name;
	String phno;
	String email;
	Mtca(String name,String phno,String email)
	{
		this.name = name;
		this.phno = phno;
		this.email = email;
	}
	public void change_Principal(String name)
	{
		this.college = name;
	}
	
}
public class Example 
{
	public static void main(String[] args) 
	{
		Mtca m1 = new Mtca("Rajesh","9059565257","Rajesh@gmail.com");
		System.out.println(m1.name);
		System.out.println((m1.principal));
		m1.change_Principal("Mr Rajesh");
		System.out.println(m1.principal);
		
	}
}

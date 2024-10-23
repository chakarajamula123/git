package polymorphism;

public class Calculation
{

	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void add(double a,double b)
	{
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) 
	{
		Calculation c1 = new Calculation();
		c1.add(10, 20);
		c1.add(10,20);
	}

}

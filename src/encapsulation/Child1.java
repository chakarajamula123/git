package encapsulation;

public class Child1 extends Parent 
{
	
	
	
	public static void main(String[] args) 
	{
		Child1 c = new Child1();
		c.method(10, 20);
		
		
	}

	public void method(int a,int b)
	{
		System.out.println("child class");
	}

}

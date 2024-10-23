package javapratice;

public class Method3 {

// without parameter Type and with return Type
	int a = 10;
	int b = 20;
	public int add() 
	{
		int c = a+b;
		return c;
	}
	//System.out.println()
	public static void main(String[] args)
	{
		Method3	m = new Method3();
		int res = m.add();
		System.out.println(res);
		
		

	}

}

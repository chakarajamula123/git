package javapratice;

public class Methods {

	static int a = 10;
	 static int b = 20;
	
	public  static void add()
	{
		int c = a+b;
		System.out.println(c);
	}


	public static void main(String[] args) 
	{

		//without parameters and without return Type

//		Methods m = new Methods();
//		int res1 = m.a;
//		int res2 = m.b;
//		System.out.println(res1);
//		System.out.println(res2);
		Methods m = new Methods();
		m.add();
	
		

	}

}

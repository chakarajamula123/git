package encapsulation;


public class MethodOverLoading 
{ 

	public void method(int a, int b) 
	{ 
		System.out.println("in parameter"); 
	} 

	public void method(float f1, float f2) 
	{ 
		System.out.println(f1+f2); 
	} 

	public static void main(String[] args) 
	{ 
		MethodOverLoading  m = new MethodOverLoading (); 
		m.method(10,20); 
	} 

} 






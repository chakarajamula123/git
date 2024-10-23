package javapratice;

public class Z 
{
	void funA()
	{
		System.out.println("funA of class Z");
	}
	int funB()
	{
		System.out.println("funB of class Z");
		return 10;
	}
	Z funZ()
	{
		Z z1 = new Z();
		return z1;
	}
}

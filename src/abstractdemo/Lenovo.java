package abstractdemo;

public abstract class Lenovo implements Laptop
{
	public void copy()
	{
		System.out.println("copy code");
	}
	   
	   public void paste()
	   {
		   System.out.println("paste code");
	   }
	   

	   public abstract void cut();
	   
	   public abstract void keyboard();
		
}

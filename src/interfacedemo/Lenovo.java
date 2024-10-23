package interfacedemo;

public  class Lenovo implements Laptop
{


	public void copy() 
	{
		System.out.println("lenovo copy code");
	}
	public void paste()
	{
		System.out.println("lenovo paste code");
		}
	public void cut()
	{
		System.out.println("lenovo cut code");
	}
	public void keyboard()
	{
		System.out.println("lenovo audio code");
		
	}
	@Override
    public void security()
    {
    	System.out.println("lenovo security code");
    }

	
}

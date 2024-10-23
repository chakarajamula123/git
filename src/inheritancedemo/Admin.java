package inheritancedemo;

//public class Admin extends Developer,Guest,  this is multiple inheritance can't implementation in class level 
public class Admin extends Developer
{
	
	//adding and updating application
	public void manage()
	{
		super.read();
		write();
		System.out.println("Manage code");
	}
	public void read()
	{
		System.out.println("Read");
	}

}

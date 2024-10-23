package encapsulation;

public class demo1 
{
	private int balance;

  public demo1(int balance)
  {
	  this.balance = balance;
  }


	public void updateBalance(int amount)
	{
		balance = balance+amount;
		System.out.println(balance);
	}
	public int getBalance()
	{
       return balance;
	}
	

}

package encapsulation;

public class demo2 {

	public static void main(String[] args)
	{
		demo1 d = new demo1(500);
		d.updateBalance(1000);
		int res = d.getBalance();
		System.out.println(res);
	}
}

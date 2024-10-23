package javapratice;

 class Car
{
	String name;
	int cost;
	
	void modifycar(Car y)
	{
		y.name = "bmw";
		y.cost =500000;
		
	}
}



public class Test2
{

	public static void main(String[] args) 
	{
		Car x = new Car();
		x.name = "maruthi";
		x.cost = 200000;
		System.out.println(x.name);
		System.out.println(x.cost);

		x.modifycar(x);
		System.out.println(x.name); 
		System.out.println(x.cost);
		
		
		
	}

}

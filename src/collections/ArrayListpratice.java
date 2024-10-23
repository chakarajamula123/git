package collections;

import java.util.ArrayList;

public class ArrayListpratice 
{

	public static void main(String[] args)
	{
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(5);
		al1.add(8);
		al1.add(0,2);
		System.out.println(al1);
		
		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(6);
		al2.add(9);
		al1.addAll(0,al2);
		System.out.println(al1);

	}

}

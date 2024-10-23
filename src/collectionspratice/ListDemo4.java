package collectionspratice;

import java.util.ArrayList;
import java.util.List;

public class ListDemo4 
{

	public static void main(String[] args) 
	{
		List l1 = new ArrayList();
		l1.add(10);
		l1.add(true);
		l1.add("RBGtechnology");
		System.out.println(l1.get(0));
		Object ob1 = l1.get(0);
		System.out.println(ob1);
		
		List<String> l2 =new ArrayList<>();
		l2.add("RBGtechnology");
		System.out.println(l2.get(0));
		String s1 = l2.get(0);
		System.out.println(s1);
		
		List<Integer> l3 = new ArrayList<>();
		l3.add(10);
		System.out.println(l3.get(0));
		Integer i1 = l3.get(0);
		System.out.println(i1);
		
		List<Boolean> l4 = new ArrayList<>();
		l4.add(true);
		System.out.println(l4.get(0));
		Boolean b1 = l4.get(0);
		System.out.println(b1);
		
		
	}

}

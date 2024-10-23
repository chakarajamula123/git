package collectionspratice;

import java.util.ArrayList;
import java.util.List;

public class ListDemo3 
{

	public static void main(String[] args) 
	{
		List<String> l1 = new ArrayList<>();
		l1.add("RBGtechnology");
		l1.add("java");
		l1.add("selenium");
		int totalElementCount = l1.size();
		System.out.println("totalElementCount :"+totalElementCount);
		
		l1.add("RBGtechnology");
		l1.add("java");
		l1.add("selenium");
		l1.add("APItesting");
		int totalElementCount1 = l1.size();
		System.out.println("totalElementCount1 :"+totalElementCount1);
		System.out.println(l1);
	}

}

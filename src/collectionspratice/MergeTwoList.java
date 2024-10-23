package collectionspratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeTwoList 
{

	public static void main(String[] args)
	{
		Integer[] arr1 = new Integer[]{4,9,8};
		LinkedList<Integer> l1 = new LinkedList<>(Arrays.asList(arr1)); 

		Integer[] arr2 = new Integer[]{5,0,10};
		LinkedList<Integer> l2 = new LinkedList<>(Arrays.asList(arr2)); 
		l1.addAll(l2);
		System.out.println(l1);





		List<String> originalList = new ArrayList<>();
		originalList.add("A");
		originalList.add("B");
		originalList.add("C");
		originalList.add("D");
		originalList.add("E");
		originalList.add("F");
		System.out.println(originalList);
		// Defining the split point
		int splitPoint = originalList.size() / 2;
		System.out.println(splitPoint);

		// Splitting the list into two sublists
		List<String> firstHalf = originalList.subList(0, splitPoint);
		List<String> secondHalf = originalList.subList(splitPoint, originalList.size());

		System.out.println("First Half: " + firstHalf);
		System.out.println("Second Half: " + secondHalf);
	}
}




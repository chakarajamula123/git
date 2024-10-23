package collectionspratice;

import java.util.Arrays;
import java.util.LinkedList;

public class SumOfEvenNumbers 
{

	public static void main(String[] args)
	{
		Integer[] arr = new Integer[]{4,5,0,9,8,10};
		LinkedList<Integer> l1 = new LinkedList<>(Arrays.asList(arr));
		int evenanumbers=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2 == 0)
			{
				System.out.println("Print even numbers :"+arr[i]);
				evenanumbers = evenanumbers+arr[i];
			}
		}
		System.out.println("total evan numbers count :"+evenanumbers);
	}
}

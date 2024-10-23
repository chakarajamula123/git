package collectionspratice;

import java.util.ArrayList;
import java.util.Arrays;

public class SumofList 
{
	public static void main(String[] args) 
	{
		/*Integer[] arr = new Integer[]{4,5,0,9,8,10};
      ArrayList<Integer> al = new ArrayList<>(Arrays.asList(arr));
      int sum = 0;
      for(int i=0;i<arr.length;i++)
      {
    	  sum = sum+arr[i];
      }
      System.out.println(sum);
	}*/


		int [] a ={4,5,0,9,8,10};
		int sum1 =0;
		
		for(int i=0;i<a.length;i++)
		{
			sum1 = sum1+a[i];
			
		}
		System.out.println("sum of elements :"+sum1);
		System.out.println("length of element :"+a.length);
		int avg = sum1/a.length;
		System.out.println("average of elements :"+avg);
	}
}

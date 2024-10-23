package javapratice;

import java.util.Scanner;

public class ArraysDemo1
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int a[] = new int[5];
		for (int i=0;i<a.length;i++)
		{
			System.out.println("Entere the age");
			a[i] = scan.nextInt();
		}
			System.out.println("the agee' are");
			for (int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
			
			

	}

}

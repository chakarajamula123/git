package javapratice;

import java.util.Scanner;

public class ArraysDemo4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[][] = new int[3][];
		a[0] = new int[3];
		a[1] = new int[2];
		a[2] = new int[5];
		
		for (int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("Enter the the class "+i+" student "+j);
				a[i][j] = scan.nextInt();
			}
		}
		System.out.println("the age's are");
		for (int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println(a[i][j]);
			}
		}
	}

}

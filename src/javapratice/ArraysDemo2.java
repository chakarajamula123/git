package javapratice;

import java.util.Scanner;
//two dimensional array
public class ArraysDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[][] = new int[3][5];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("Enter the class "+i+" stident"+j);
				a[i][j] = scan.nextInt();
			}
		}
		System.out.println("the age are");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println(a[i][j]);
			}
		}
	}
}


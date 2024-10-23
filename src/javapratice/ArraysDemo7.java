package javapratice;

public class ArraysDemo7 {

	public static void main(String[] args) {
		int a[][] = { {10,20,30},{50,60,70,80},{90,100} };

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println(a[i][j]); 
			}
		}

	}

}

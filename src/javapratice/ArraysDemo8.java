package javapratice;

public class ArraysDemo8 {

	public static void main(String[] args) {
		int a[][][]={ { {1,2},{3,4} },{ {5,6},{7,8} } };
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
					System.out.println("enter "+i);
					System.out.println(a[i][j][k]);
				}
			}
			

		}

	}

}

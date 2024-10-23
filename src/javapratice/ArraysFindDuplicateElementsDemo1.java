package javapratice;

public class ArraysFindDuplicateElementsDemo1 {

	public static void main(String[] args) 
	{
		String a[] = {"Java","Python","c","c++","Java","Python","Oracle"};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i] == a[j])
				{
					System.out.println("Duplicate element is "+a[i]);
				}
			}
		}
	}

}

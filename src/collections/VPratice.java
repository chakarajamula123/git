package collections;

import java.util.Vector;

public class VPratice 
{

	public static void main(String[] args)
	{
		Vector v1 = new Vector();
		v1.add("java");
		v1.add("c");
		v1.add("python");
		System.out.println(v1);
		System.out.println(v1.size());//size means no.of elements present in list
		System.out.println(v1.capacity());
		Vector v2 = new Vector();
		v2.add(".net");
		v2.add("c##");
		for(int i=0;i<v2.size();i++)
		{
			v1.add(v2.get(i));
			
		}
		System.out.println(v1);

	}

}

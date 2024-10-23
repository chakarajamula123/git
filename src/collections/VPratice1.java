package collections;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Vector;

import javapratice.arraysDemo5;

public class VPratice1
{

	public static void main(String[] args) 
	{
		Vector v1 = new Vector();
		v1.add("java");
		v1.add("python");
		v1.add("c");

		Vector v2 = new Vector();
		v2.add("c##");
		v2.add(".net");




		System.out.println("print the v1 elements :"+v1);
		System.out.println("print the v2 elements : "+v2);
		v1.addAll(v2);
		System.out.println("print the v1 elements after adding the v2 elements :"+v1);//v2 all elements adding to v1

		//Get method
		System.out.println("get the 0 index element : "+v1.get(0));

		//Deletion method
		System.out.println("remove the 0 index position :"+v1.remove(0));//remove the 0 index position
		System.out.println("print the elements after remove the 0 index position : "+v1);//print the elements after remove the 0 index position

		//verification of element from the list
		//using contains method
		System.out.println("after emove the 0 index :"+v1.contains("java"));//false
		System.out.println("checking the c :"+v1.contains("c"));
		System.out.println("checking the elements of v2 : "+v1.containsAll(v2));

		//update
		System.out.println("before update print v1 elements"+v1);
		v1.set(1,"core java");
		System.out.println("print v1 elements after update"+v1);
		System.out.println("print index position of python: "+v1.indexOf("python"));
		System.out.println("print lastelement :"+v1.lastElement());
		System.out.println("print firstelement : "+v1.firstElement());
        
		
		Object[] arr = v1.toArray();
		System.out.println("change to array :"+Arrays.toString(arr));
		
		Object[] arr1 = new Object[]{1,2,5,8,9};
		Vector v4 = new Vector(Arrays.asList(arr));
		System.out.println("change to array"+v4);
		System.out.println(v1.removeAll(v2));
		v1.clear();
		System.out.println(v1);
		
		Object[] arr2 = v1.toArray();
		System.out.println(Arrays.toString(arr2));
		
		
		Object[] arr3 = new Object[]{2,3,6,9};
		Vector v5 = new Vector(Arrays.asList(arr3));
		System.out.println(v5);
		
	}

}

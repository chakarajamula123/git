package javapratice;

import java.util.Arrays;

public class StringDemo1 {

	public static void main(String[] args) {
		//Difference ways to create strings
		//    String s1 = "Java";//direct assign
		//    String s2 = new String("JAVA");//object creation
		//    String s3 = "Java";

		//    System.out.println(s1);
		//    System.out.println(s2);
		//    System.out.println(s1==s2);//only address verify or address comparision no data verify
		//	System.out.println(s1.equals(s2));//equals method is used data verifyed or data comparision

		//String Methods
		//startswith
		//endswith
		//contains
		//equals
		//equalsIgnoreCase
		//length
		//trim
		//toLowerCase
		//toUpperCase
		//toCharArry
		//indexof
		//subString




		String s1 = "Hello";
		String s2 = "hello java";
		String s3 = "178";
		int i1 = 1789;
		String s4 = String.valueOf(i1);

		System.out.println(s1.equalsIgnoreCase(s2));//only data matching
		System.out.println(s1.contains("He"));//verify characters
		System.out.println(s1.contains("y"));
		System.out.println(s1.startsWith("He"));//starting values comparision
		System.out.println(s1.endsWith("o"));//ending values comparision
		System.out.println(s1.equals(s2));//data comparision
		System.out.println(s1.length());//counting characters
		System.out.println(s1.trim());//remove spaces starting and ending
		System.out.println(s1.toLowerCase());//convert lowercase
		System.out.println(s1.toUpperCase());//convert uppercase
		char [] c = s1.toCharArray();
		System.out.println(s1.toCharArray());//convert arrys each character seperates
		System.out.println(s1.indexOf("e"));//finding index position
		System.out.println(s1.lastIndexOf("l"));//finding last occurance
		System.out.println(s1.substring(2,4));//received elements
		System.out.println(Arrays.toString(s2.split(" ")));//spilts elements
		System.out.println(s1.charAt(4));//received elements by index position
		System.out.println(s1.replace("o","z"));//replace elements
		System.out.println(Integer.valueOf(s3));
		int i = Integer.valueOf(s3);
		System.out.println(s3);
		System.out.println(s4);


	}


}

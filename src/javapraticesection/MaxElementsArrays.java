package javapraticesection;

public class MaxElementsArrays {

	public static void main(String[] args) {
      int a[]={10,30,60,110,70,90,20};
      int max = a[0];
      for(int i=0;i<a.length;i++)
      {
    	  if(a[i] > max)
    	  {
    		  max =a[i];
    	  }
      }
      System.out.println(max);
	}

}

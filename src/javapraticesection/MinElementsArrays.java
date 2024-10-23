package javapraticesection;

public class MinElementsArrays {

	public static void main(String[] args) {
     int a[] = {10,40,5,60,9};
     int min = a[0];
     for(int i=0;i<a.length;i++)
     {
    	 if(a[i] < min)
    	 {
    		 min = a[i];
    	 }
     }
     System.out.println(min);
     
     int sum = 0;
     for(int i=0;i<a.length;i++)
     {
    	 sum = sum+a[i];
     }
     System.out.println(sum);
	}
	

}

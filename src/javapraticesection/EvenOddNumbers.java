package javapraticesection;

public class EvenOddNumbers 
{

	public static void main(String[] args) 
	{
		int n = 20;
		String even_numbers = "";
		String odd_numbers = "";

		for(int i=1;i<=n;i++)
		{
          if(i%2 == 0)
          {
        	  even_numbers = even_numbers + i;
        	
          }
          else
          {
        	  odd_numbers = odd_numbers + i;
        	  
          }
		}
		 System.out.println(even_numbers);	
		 System.out.println(odd_numbers);
	}

}

package encapsulation;

public class Student 
{
   int rollNumber;
   String name;
   boolean isAttended;
   
   


//public  Student(int rollNumber)
//   {
//	   this.rollNumber = rollNumber;
//   }
   
  

public void setStudentAttended(boolean flag)
   {
	   isAttended = flag;
   }
   
   public boolean getStudentAttended()
   {
	   System.out.println("Teacher accessed student attendence");
	   return isAttended;
   }
	

}

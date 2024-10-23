package encapsulation;

public class Student1 
{
	int rollNo;
	String name;
	boolean isAttended;
	
	public Student1(int rollNo)
	{
		this.rollNo = rollNo ;
	}
	public void setStudentAttendence(boolean flag)
	{
		isAttended = flag;
		System.out.println(isAttended);
		System.out.println("Teacher assign attendence to student");
	}
	
	public boolean getStudentAttendence()
	{
		System.out.println("Teacher accesses student attendence");
		return isAttended;

	}

}

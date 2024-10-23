package encapsulation;

public class Teacher1 
{
	public static void main(String[] args) 
	{
		Student1 s = new  Student1(101);
		s.setStudentAttendence(true);
		boolean res = s.getStudentAttendence();
		System.out.println(res);
		}
}

package week2_Day3Assignments;

public class Students
{
	public int getStudentInfo(int id)
	{
		System.out.println("Student ID is: " +id);
		return id;
	}
	
	public void getStudentInfo(int id, String name)
	{
		System.out.println("Student Name is: " + name);
	}
	
	public void getStudentInfo(String email, long phNo)
	{
		System.out.println("Student Email and Contact No is " + email + phNo);
	}
	
	public static void main(String[] args) 
	{
		Students s = new Students();
		s.getStudentInfo(123);
		s.getStudentInfo(123, "Sharmi");
		s.getStudentInfo("christysharmila9@gmail.com" , 9865489897L);
		

	}

}

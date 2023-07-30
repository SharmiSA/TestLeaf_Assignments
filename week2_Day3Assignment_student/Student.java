package week2_Day3Assignment_student;

import week2_Day3Assignment_department.Department;

public class Student extends Department
{
	public void studentName()
	{
		System.out.println("Sharmila");
	}
	
	public void studentDept()
	{
		System.out.println("BBA");
	}
	
	public void studentId()
	{
		System.out.println("234527");
	}


	public static void main(String[] args) 
	{
		Student s = new Student();
		s.collegeCode();
		s.collegeName();
		s.collegeRank();
		s.departmentName();
		s.studentDept();
		s.studentId();
		s.studentName();
	}
	
	}

package Org.student;

import Org.system.College;

public class Student extends College{

	 

public void studentName()
{
	System.out.println("Called Student::studentName");

}
public void studentDept()
{
	System.out.println("Called Student::studentDept");

}
public void studentId()
{
	System.out.println("Called Student::studentId");

}
public static void main(String[] args) {
	Student obj=new Student();
	obj.CollegeCode();
	obj.CollegeName();
	obj.CollegeRank();
	obj.deptName();
	obj.studentId();
}
}
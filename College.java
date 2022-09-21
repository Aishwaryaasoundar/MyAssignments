package Org.system;


import Org.department.Department;

public class College extends Department
{
	/* Package   :org.college
     Class     :College
     Methods   :collegeName(),collegeCode(),collegeRank()

     Package   :org.department
     Class        :Department
     Methods   :deptName()
 
     Package   :org.student
     Class        :Student
     Methods   :studentName(),studentDept(),studentId()
  
Description:
create above 3 class and call all your class methods into the Student using multilevel inheritance.*/
	public void CollegeName() 
	{
		System.out.println("Called College::CollegeName");
	}
	public void CollegeCode() 
	{
		System.out.println("Called College::CollegeCode");
	}
	public void CollegeRank() 
	{
		System.out.println("Called College::CollegeRank");
	}
	



}

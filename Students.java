package Week3.day2;

public class Students {

	 /* Class: Students
    Methods: getStudentInfo()

Description: 
Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber*/
public void getStudentInfo(int id)
{
	System.out.println("student id is  "+id);
}
public void getStudentInfo(String name,String Email)
{
	System.out.println("student email id is  " +Email);
}
public void getStudentInfo(long phonenumber)
{
	System.out.println("student phonenumber is   "+phonenumber);
}
public static void main(String[] args) {
	Students obj=new Students();
	obj.getStudentInfo(1234);
	obj.getStudentInfo("Aishwarya","abc@gmail.com");
	obj.getStudentInfo(1234456669);
}
}


package week1.day2;

public class Palindrome 
{
 public static void main(String[] args) 
 {
	int num = 34343;	
	int temp = num;
	int reverse=0;
	int rightDigit;
	
	while(temp !=0 )
	{
		rightDigit = temp % 10;
		reverse = reverse*10 + rightDigit;
		temp = temp/10;
	}	
	
	if(num == reverse)
	{
		System.out.println(num +" is palindrome");
	}
	else
	{
		System.out.println(num + " is Not palindrome");
	}
	
	
 }
}

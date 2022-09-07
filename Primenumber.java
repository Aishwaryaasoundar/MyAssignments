package week1.day2;


public class Primenumber 
{
	public static void main(String[] args) 
	{
		int num=13;
		int i;
		boolean isprime=true;
		for(i = 2; i< num -1 ; i++)
		{
		if(num % i == 0)
			{
				//System.out.println(i);	
				isprime=false;			
			}
		}
		if(isprime)
		{
		      System.out.println(num + " is a prime number");
		}
		else
		{
		      System.out.println(num + " is not a prime number");
		}
	}

}

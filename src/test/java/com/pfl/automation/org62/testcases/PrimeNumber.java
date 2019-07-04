package com.pfl.automation.org62.testcases;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int n = 3331;
		boolean flag = false;
		
		for(int i=2; i<=n/2; ++i)
		{
			if(n%i==0)
			{
				//System.out.println(n+ "is a prime number");
				flag = true;
				break;
			}
			
		}
		if(flag==false)
		{
			System.out.println(n+ " is a prime number");
		}
		else 
		{
			System.out.println(n+ " is not a prime number");
		}	
		
	}

}

package com.pfl.automation.org62.testcases;

public class printOddNumbers {

	public static void main(String[] args) 
	{
		
		int min = 101, max = 203;
		
		printOddNumberwithrange(min, max);
		
	}
	
	public static void printOddNumberwithrange(int min, int max)
	{
		
		while(min<=max)
		 
		{
			if(min%2==1)
				{
					System.out.println(min);
				}
			min++;
		}
		
	}

}

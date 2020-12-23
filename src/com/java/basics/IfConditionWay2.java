package com.java.basics;

public class IfConditionWay2 {

	public static void main(String[] args) 
	{
	int age=19;
	calculateEligibility(age);	
	}
	
	public static void calculateEligibility(int a)
	{
		if (a>18)
		{
			System.out.println("eligibal for vote");
		}
		else 
		{
			System.out.println("Not eligibal for vote");
		}
		
	}
}

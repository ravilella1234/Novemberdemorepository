package com.hdfc.loans.carloans;

public class SecondClass 
{
	int x=10,y=20,result;  // properties
	
	void add()
	{
		result = x+y;
		System.out.println("Add of A & B  is : " + result);
	}
	
	void sub()
	{
		result = x-y;
		System.out.println("Sub of A & B is : " + result);
	}
	
	
	public static void main(String[] args) 
	{
				
		
		System.out.println("Hello.....");
		SecondClass obj = new SecondClass();
		obj.add();
		obj.sub();
		
		
		SecondClass obj1 = new SecondClass();
		obj1.add();
		obj1.sub();
	}
}

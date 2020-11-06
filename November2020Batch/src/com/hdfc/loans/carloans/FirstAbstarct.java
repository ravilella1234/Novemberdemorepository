package com.hdfc.loans.carloans;

public abstract class FirstAbstarct
{
	int x=100;
	
	public void m1()
	{
		System.out.println("iam m1 concrete from FirstAbstract");
	}
	
	public abstract void m2();
	
	public static void main(String[] args) 
	{
		//FirstAbstarct obj = new FirstAbstarct();
		
		FirstAbstarct f ;
		
		f= new ChildClass();
		f.m1();
		f.m2();
	}

}

package com.hdfc.loans.carloans;

public abstract class ChildClass1 extends FirstAbstarct
{
	public abstract void  m3(); 
	
	@Override
	public void m2() 
	{
		System.out.println("iam overridden m2 from childclass1");
		
	}
	
	public static void main(String[] args) 
	{
		//ChildClass1 c1  = new ChildClass1();
		//c1.m1();
		//c1.m2();
		
	}

}

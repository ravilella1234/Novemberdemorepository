package com.hdfc.loans.carloans;

public class ChildClass2 extends ChildClass1
{
	
	@Override
	public void m2() 
	{
		System.out.println("iam overridden m2 from childclass2");
		
	}
	
	
	public static void main(String[] args) {
		ChildClass2 c2 =new ChildClass2();
		c2.m1();
		c2.m2();
		c2.m3();
	}


	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

}

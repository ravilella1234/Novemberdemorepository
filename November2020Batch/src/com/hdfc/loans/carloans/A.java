package com.hdfc.loans.carloans;

import java.util.Date;

public  final abstract class A 
{
	
	final int x=10;
	final static int y=20;

	public final strictfp void m1()
	{
		System.out.println("A : iam m1 from  A");
	}
	
	public static void m4()
	{
		System.out.println("iam m4 static method");
	}
	
	static
	{
		System.out.println("iam static block....");
	}
	
	static
	{
		Date dt = new Date();
		System.out.println(dt);
	}
	

	public static void main(String[] args) 
	{
		
		final int z=30;
		A  a = new A();
		a.m1();
		m4();
		System.out.println(a.x);
		a.x=100;
		System.out.println(a.x);
		
		System.out.println(A.y);
		A.y=200;
		System.out.println(A.y);
		
		System.out.println(z);
		z=300;
		System.out.println(z);
		
	}

}

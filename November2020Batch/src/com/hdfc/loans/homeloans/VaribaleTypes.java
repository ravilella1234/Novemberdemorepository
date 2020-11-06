package com.hdfc.loans.homeloans;

public class VaribaleTypes 
{
	//primitive
	int a=100; // instance (or) non-static (or) instance-global variable
	static String cname = "vmware"; //static (or) static-global
	static float roi = 8.5f;
	static VaribaleTypes obj;
	
	public void m1()
	{
		int a=200;  // local variable
		//System.out.println(b);
		
		System.out.println(this.a);
		System.out.println(VaribaleTypes.cname);
	}
	
	public static void m2()
	{
		obj = new VaribaleTypes();
		System.out.println(obj.a);
		System.out.println(VaribaleTypes.cname);
	}
	
	public static void main(String[] args) 
	{
		obj = new VaribaleTypes();
		System.out.println(obj.a);
		System.out.println(VaribaleTypes.cname);
	}
	

}

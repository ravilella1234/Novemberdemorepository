package com.hdfc.loans.homeloans;

public class EmployeeChild extends Employee
{
	String city;
	
	public EmployeeChild(String city) 
	{
		super(1744, "sai", 13.45f);
		this.city = city;
		
		System.out.println(this.city);
		
	}
	
	void m5()
	{
		
	}

	public static void main(String[] args) 
	{
		EmployeeChild e = new EmployeeChild("hyderabad");

	}

}

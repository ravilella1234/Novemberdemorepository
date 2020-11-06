package com.hdfc.loans.carloans;

public interface Rbi 
{
	int x=10;
	
	void withdrawl();  // Abstract method
	void deposit();
	
	public static void main(String[] args) 
	{
		//Rbi i1 = new Rbi();
		
		Rbi i ; 
		
		i = new Icici();
		i.deposit();
		i.withdrawl();
		
		i = new Hdfc();
		i.deposit();
		i.withdrawl();
	}
	

}

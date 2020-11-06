package com.hdfc.loans.carloans;


class Parent
{
	public  Number workHard()
	{
		System.out.println("Parent : Wakeup early, goto college...");
		return 0;
	}
	
	public void care()
	{
		System.out.println("Pafrent : Atmost care.......");
	}
}

public class Child extends Parent
{
	public  Object workHard()
	{
		System.out.println("Child : Wakeup anytime, goto movie...");
		return 0;
	}
	
	
	public void love()
	{
		System.out.println("Child : iam in love....");
	}
	
	public static void main(String[] args) 
	{
	   Child obj = new Child();
	   obj.workHard();
	   obj.care();
	   obj.love();
	}

}

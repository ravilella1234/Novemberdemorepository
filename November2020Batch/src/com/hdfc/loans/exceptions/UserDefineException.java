package com.hdfc.loans.exceptions;

import java.util.Scanner;

public class UserDefineException extends Exception
{

	public UserDefineException(String string)
	{
		super(string);
	}

	public static void main(String[] args) 
	{
		String name;
		Scanner sc = new Scanner(System.in);
		
		
		while (true) 
		{
			System.out.println("Enter the 10 character Name : ");
			name = sc.next();
			
			try 
			{
				if (name.length() != 10) 
				{
					throw new UserDefineException("String name should be 10 characters...");
				} 
				else 
				{
					System.out.println(name);
					break;
				}
			} 
			catch (UserDefineException e)
			{
				e.printStackTrace();
			} 
		}
	}

}

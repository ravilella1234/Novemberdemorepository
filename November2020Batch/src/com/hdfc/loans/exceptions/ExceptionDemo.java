package com.hdfc.loans.exceptions;

import java.util.Scanner;

public class ExceptionDemo 
{

	public static void main(String[] args) 
	{
		int nr,dr,result;
		Scanner sc= new Scanner(System.in);
		
		
		
		while (true) 
		{
			System.out.println("Enter the nr  :");
			nr = sc.nextInt();
			
			System.out.println("Enter the dr :");
			dr = sc.nextInt();
			
			try 
			{
				result = nr / dr;
				System.out.println("Result is : " + result);
				break;
			} 
			catch (ArithmeticException e) 
			{
				e.printStackTrace();
				//System.out.println(e);
				//System.out.println("denominator value should be greater than zero.....0");
			}
			finally {
				System.out.println("iam final....");
			}
			
			
		}

	}

}

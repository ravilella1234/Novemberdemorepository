package com.hdfc.loans.homeloans;

import java.util.Scanner;

public class ArrayDemo 
{

	public static void main(String[] args)
	{
		/*
		 * int[] a = {10,20,30,40};
		 * 
		 * for(int i=0;i<a.length;i++) { System.out.println("a["+i + "]=" + a[i]); }
		 */
		
		
		// *******************  2nd way  **************************** 
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int aSize = sc.nextInt();
		
		int[] a = new int[aSize];
		int sum=0;
		
		System.out.println("Enter the array Elements : ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
			System.out.println("a["+i+"]="+a[i]);
			sum = sum + a[i];
		}
		System.out.println("Sum of the array is : " +sum);
		
		
		
		//  *************************  3rd way  **************************
		int[] b = new int[]{100,200,300};
		for(int j=0;j<b.length;j++)
		{
			System.out.println(b[j]);
		}
		

	}

}

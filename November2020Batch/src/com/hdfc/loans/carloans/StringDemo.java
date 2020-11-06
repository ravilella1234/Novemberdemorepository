package com.hdfc.loans.carloans;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		String s1 = "Ravikanth";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.charAt(1));
		System.out.println(s1.indexOf('v'));
		System.out.println(s1.hashCode());
		System.out.println(s1.startsWith("avi"));
		System.out.println(s1.endsWith("nth"));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		String s2 = "Ravikanth";
		System.out.println(s1.equals(s2));
		System.out.println(s1.toLowerCase().equals(s2));
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s1.contains(s2));
		
		
		String s3 = new String("lella");
		System.out.println(s1+s3);
		System.out.println(s1.concat(s3));
		
		String s4 = " ravikanth";
		System.out.println(s4);
		System.out.println(s4.trim());
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s4.trim()));
		
		System.out.println(s1.toLowerCase().equals(s4.trim()));
		
		System.out.println(s1.substring(2, 7));
		
		
		System.out.println(s1.replace('R', 'K'));
		
		String s5 = "ravi kanth lella";
		System.out.println(s5);
		String[] sArray = s5.split("t");
		for( String s  : sArray)
		{
			System.out.println(s);
		}
		
		System.out.println(s5.replace(' ', '.'));

	}

}

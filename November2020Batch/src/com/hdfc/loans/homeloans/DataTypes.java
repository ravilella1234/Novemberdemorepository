package com.hdfc.loans.homeloans;

public class DataTypes 
{
	//integral DT's
	byte b;  // 1 byte
	short s;  // 2 bytes
	int i;  // 4 bytes
	long l;  // 8 bytes
	
	//floating DT's
	float f; //4 bytes
	double d; //8 bytes
	
	boolean bb;
	char ch; // 2 bytes
	
	String str;
	
	static String cname;
	
	
	
	public static void main(String[] args) 
	{
		int x=0;
		
		DataTypes obj = new DataTypes();
		System.out.println("Byte : " + obj.b);
		System.out.println("Short : " + obj.s);
		System.out.println("Integer : " + obj.i);
		System.out.println("Long : " + obj.l);
		
		System.out.println("Float : " + obj.f);
		System.out.println("Double : " +  obj.d);
		
		System.out.println("Boolean : " + obj.bb);
		System.out.println("Char : " + obj.ch);
		
		System.out.println("String : " + obj.str);
		
		System.out.println("Cname : " + DataTypes.cname);
		
		System.out.println(x);
	
	}

}

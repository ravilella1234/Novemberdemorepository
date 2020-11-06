package com.hdfc.loans.homeloans;

public class TwoDimensionArray 
{

	public static void main(String[] args) 
	{
		//int[] i = {10,20,30};
		int[][] p  = {
						{10,20,30},
						{40,50},
						{70,80,90,60}
					 };
		
		for(int i=0;i<p.length;i++)
		{
			for(int j=0;j<p[i].length;j++)
			{
				System.out.print(p[i][j] + "  ");
			}
			System.out.println("");
		}
		
		for(int q[] : p)
		{
			for(int l:q)
			{
				System.out.print(l + "  ");
			}
			System.out.println("");
		}

	}

}

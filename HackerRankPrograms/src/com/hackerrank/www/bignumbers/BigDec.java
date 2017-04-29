package com.hackerrank.www.bignumbers;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigDec 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] s=new String[n+2];
		for(int i=0;i<n;i++)
		{
			s[i]=sc.next();
		}
		sc.close();
	    // Comparator is an interface hence creating object by using anonymous inner class
		
		Comparator<String> comparator=new Comparator<String>()
		{
			public int compare(String s1,String s2)
			{
				BigDecimal a=new BigDecimal(s1);
				BigDecimal b=new BigDecimal(s2);
				// comparing a & b values
				return b.compareTo(a);
			}
			
		};
		// Sorting the array in descending order
		Arrays.sort(s,0,n, comparator);
		//Output 
		for(int i=0;i<n;i++){
			System.out.println(s[i]);
		}
		
	}

}

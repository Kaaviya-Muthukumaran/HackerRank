package com.hackerrank.www.strings;

import java.util.Scanner;

public class StringReverse2 
{
	public static void main(String[] args) 
	{
		
		Scanner sc1=new Scanner(System.in);
		String A=sc1.next();
		String B="";
		//reverse condition
		for(int i=A.length()-1;i>=0;i--)
		{
			B=B+A.charAt(i);
			
		}
		//if reversed value and user input values are same prints yes otherwise prints no
		if(A.equals(B))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		sc1.close();
		
	}

}

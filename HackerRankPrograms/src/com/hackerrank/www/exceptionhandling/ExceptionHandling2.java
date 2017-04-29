package com.hackerrank.www.exceptionhandling;

import java.util.Scanner;

class MyCalculator
{
	// either n or p is negative,throws an exception
	public int power(int n,int p) throws Exception
	{
		if(n<0 || p<0)
		{
			throw new Exception("n and p should be non-negative" );
		}
	// both n and p is positive values just returns the corresponding value
		return (int) Math.pow(n, p);
		
		
	}
	
}

public class ExceptionHandling2 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		
		while(in.hasNext())
		{
			int n=in.nextInt();
			int p=in.nextInt();
			MyCalcultor my_calculator=new MyCalcultor();
			try{
				System.out.println(my_calculator.power(n, p));
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		
		
		in.close();	
	}
	
}

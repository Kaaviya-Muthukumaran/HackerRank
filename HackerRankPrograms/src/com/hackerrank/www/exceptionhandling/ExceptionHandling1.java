package com.hackerrank.www.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling1 
{
	public static void main(String[] args) throws ArithmeticException
	{
	Scanner sc=new Scanner(System.in);
	try{
	try{
	// if x and y are 32bit integers output will be x/y	
	int x=sc.nextInt();
	int y=sc.nextInt();
	System.out.println(x/y);
	}
	// if x and y are not integers it will throw exception
	catch(InputMismatchException e){
		System.out.println("java.util.InputMismatchException");
	}
	}
	//if y is zero it will throw arithmetic exception
	catch(Exception e){
		System.out.println(e);
	}

	sc.close();
  }

}

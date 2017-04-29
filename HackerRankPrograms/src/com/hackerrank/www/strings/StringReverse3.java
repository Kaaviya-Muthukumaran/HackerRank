package com.hackerrank.www.strings;

import java.util.Scanner;

public class StringReverse3
{
	public static void main(String[] args) 
	{
		
	
	Scanner sc1=new Scanner(System.in);
	String A=sc1.next();
	// Creating a StringBuffer object by passing a String value
	StringBuffer B=new StringBuffer(A);
	//reversing the string
	StringBuffer res=B.reverse();
	/*converting the reversed string buffer into string 
	 *and checking if it is equal to user input String value
	*/
	if(res.toString().equals(A))
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

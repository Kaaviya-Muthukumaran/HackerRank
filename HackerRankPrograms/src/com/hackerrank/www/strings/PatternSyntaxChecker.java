package com.hackerrank.www.strings;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternSyntaxChecker 
{
	 public static void main(String[] args)
	 {
	      Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      // if test case greater than zero it reads the pattern and decrement by one every time
	      while(testCases>0)
	      {
	         String pattern = in.nextLine();
	          testCases--;
	       try
		    {
	    	   // if pattern is correct prints valid otherwise prints invalid
		        Pattern.compile(pattern);
		        System.out.println("Valid");
		    }
		      catch (Exception e)
		    {
		        System.out.println("Invalid");
		    }
		           
		  }
	      in.close();
		
	 }

}

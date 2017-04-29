package com.hackerrank.www.strings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokens 
{
	public static void main(String[] args) 
	{
		 Scanner scan = new Scanner(System.in);
		 String s=scan.nextLine();
		 /*creating string tokenizer object by passing string and delimiters 
		  * that is special symbols which separate the string values
		  */
		 StringTokenizer st=new StringTokenizer(s," !,?._'@");
		 //counting number of separated values
		 System.out.println(st.countTokens());
		 //if next token is present print the current token value
		 while(st.hasMoreTokens())
		 {
		 System.out.println(st.nextToken());
		 }
		 scan.close();
	}

}

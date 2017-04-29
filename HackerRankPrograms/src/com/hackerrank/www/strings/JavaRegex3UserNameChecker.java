package com.hackerrank.www.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex3UserNameChecker 
{
	public static void main(String[] args) {
	      Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      while (testCases > 0) {
	         String username = in.nextLine();
	         String pattern = "^[a-zA-Z]\\w{7,29}$";
             // checking with the inbuilt pattern
	         Pattern r = Pattern.compile(pattern);
	         // checking if it matches with user name
	         Matcher m = r.matcher(username);
	         // if it find that is matches prints valid otherwise prints invalid
	         if (m.find()) {
	            System.out.println("Valid");
	         } else {
	            System.out.println("Invalid");
	         }
	         testCases--;
	         in.close();
	      }
	   }

}

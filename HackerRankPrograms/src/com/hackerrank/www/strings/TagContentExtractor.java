package com.hackerrank.www.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor 
{
	 public static void main(String[] args){
	      
	      Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      while(testCases>0){
	         String line = in.nextLine();
	         // checking with html tags
	         Matcher m=Pattern.compile("<([^<>]+)>([^<]+)</\\1>").matcher(line);
	         // if it finds just prints the string value without tags
	          if(m.find())
	          {
	              System.out.println(m.group(2));
	          while(m.find())
	          {
	              System.out.println(m.group(2));
	          }
	          }
	          // if it is not a valid html tag just prints none
	          else
	          {
	               System.out.println("None");
	          }
	          testCases--;
	          in.close();
	      }
	   }

}

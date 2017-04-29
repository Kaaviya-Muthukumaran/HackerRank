package com.hackerrank.www.introduction;

import java.util.Scanner;


public class Loops1 
{
	  public static void main(String[] args) 
	  {
		    Scanner in = new Scanner(System.in);
	        int N = in.nextInt();
	        for(int i=1;i<=10;i++)
	        {
	        	// printing just like multiplication table
	        	int result=N*i;
	        	System.out.println(N+" x "+i+" = "+ result);
	        }
	        in.close();
	   }
	

}

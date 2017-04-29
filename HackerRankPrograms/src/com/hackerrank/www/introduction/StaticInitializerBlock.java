package com.hackerrank.www.introduction;

import java.util.Scanner;

public class StaticInitializerBlock 
{
	  // defining static variables
	   static Scanner sc1=new Scanner(System.in);
	   static int B,H;
	   static boolean flag;
	   //static blocks used for initialization
	   /*if condition is true prints 
	    * area else print exception
	    */
		static 
		{
			
			B=sc1.nextInt();
		    H=sc1.nextInt();
		    if(B>0&&H>0)
		    {
		    	flag=true;
		    }
		    else
		    {
		    	System.out.println("java.lang.Exception:"+" Breadth and height must be positive");
		    }
		   	sc1.close();	    
		}	
		
		
	    
		
	
	public static void main(String[] args)  
	{
		
		
		if(flag)
		{
			
			int area=B*H;
			System.out.println(area);
			
		}
		
		
	
	}

}

package com.hackerrank.www.introduction;

import java.util.Scanner;

public class EndOfFile 
{
	public static void main(String[] args) 
	{
       
		Scanner sc1=new Scanner(System.in);
		/*printing the line number 
		 * followed by a single space,
		and then the line content received as input.*/
		for(int i=1;sc1.hasNextLine();i++)
		{
			
				String s=sc1.nextLine();
				System.out.println(i+" "+s);
		}
			
		sc1.close();	
		}
    }



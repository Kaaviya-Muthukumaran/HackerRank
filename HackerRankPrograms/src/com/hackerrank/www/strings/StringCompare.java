package com.hackerrank.www.strings;

import java.util.Scanner;

public class StringCompare 
{
	public static void main(String[] args) 
	{
		
		Scanner sc1=new Scanner(System.in);
		String s1=sc1.next();
		int x=sc1.nextInt();
		//consider the values in between 0 and user input
		String min=s1.substring(0, x);
		String max=s1.substring(0, x);
		for(int i=0;i+x<=s1.length();i++)
		{
			// comparing the values if max is greater assign max value to max
			if((s1.substring(i,i+x).compareTo(max)>0))
			{
			   max=s1.substring(i, i+x);
				
			}
			// comparing the values if min is smaller assign min value to min
			if((s1.substring(i,i+x).compareTo(min)<0))
			{
			   min=s1.substring(i,i+x);
			}
			
		}
		System.out.println(min);
		System.out.println(max);
		
		
		sc1.close();
	}
	

}

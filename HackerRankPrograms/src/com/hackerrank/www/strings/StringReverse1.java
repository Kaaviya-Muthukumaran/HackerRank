package com.hackerrank.www.strings;

import java.util.Scanner;

public class StringReverse1 
{
	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		String A=sc1.next();
		// first index
		int i=0;
		//last index
		int j=A.length()-1;
		//middle one
		int l=(i+j)/2;
		for(int k=i;k<=l;k++)
		{
			//checking whether the corresponding values of i and j is equal
			if(A.charAt(i)==A.charAt(j))
			{
				i++;
				j--;
				
			}
			else
			{
				break;
			}
			
		}
		//If values are same prints yes otherwise prints no
		if(i==l+1)
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

package com.hackerrank.www.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams 
{
	static boolean isAnagram(String a,String b)
	{
		
		//removing all spaces
		String A=a.replaceAll("\\s","");
		String B=b.replaceAll("\\s","");
		boolean ret=true;
		//checking the length
		if(A.length()!=B.length())
		{
			ret=false;
		}
		// if length is equal convert string to lower case and char array and sort it(smaller to bigger)
		else
		{
			char[] a1=A.toLowerCase().toCharArray();
			char[] b1=B.toLowerCase().toCharArray();
			Arrays.sort(a1);
			Arrays.sort(b1);
			ret=Arrays.equals(a1, b1);
		}
		return ret;
    
			
	}
		

	public static void main(String[] args) 
	{
		//getting input from the user
		Scanner sc1=new Scanner(System.in);
		String a=sc1.next();
		String b=sc1.next();
		sc1.close();
		boolean ret=isAnagram(a, b);
		//if ret is true prints Anagrams, false prints NotAnagrams
		System.out.println((ret)?"Anagrams":"NotAnagrams");
		
	}

}

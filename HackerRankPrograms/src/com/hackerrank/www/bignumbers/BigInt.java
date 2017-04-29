package com.hackerrank.www.bignumbers;

import java.math.BigInteger;
import java.util.Scanner;

public class BigInt 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		{
		// creating big integer object by passing user input
		BigInteger bigin1=new BigInteger(sc.next());
		BigInteger bigin2=new BigInteger(sc.next());
		//adding two values
		BigInteger sum=bigin1.add(bigin2);
		// multiplying two values
		BigInteger mul=bigin1.multiply(bigin2);
		//output
		System.out.println(sum);
		System.out.println(mul);
		
		sc.close();
		}
		
		
	}

}

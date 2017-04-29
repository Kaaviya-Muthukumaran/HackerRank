package com.hackerrank.www.bignumbers;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntPrime 
{
	public static void main(String[] args) 
	{
		  Scanner in = new Scanner(System.in);
	      BigInteger n=in.nextBigInteger();
	      //Checking whether it is prime or not
	      System.out.println(n.isProbablePrime(10)?"Prime":"NotPrime");
	      in.close();
		
	}

}

package com.hackerrank.www.strings;

import java.util.Scanner;

public class JavaRegex 
{
	
	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		while(sc1.hasNext())
		{
			/* reads the IP and checking whether it matches with pattern
			 * if it matches prints true if not prints false
			 */
			String IP=sc1.nextLine();
			System.out.println(IP.matches(new MyRegex().pattern));
			
		}
		sc1.close();
	}

}
class MyRegex
{
	String pattern;
	MyRegex()
	{
		//user IP address is string allows leading zeros but only four parts
		String zeroTo255="(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
		pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
	}
	
}

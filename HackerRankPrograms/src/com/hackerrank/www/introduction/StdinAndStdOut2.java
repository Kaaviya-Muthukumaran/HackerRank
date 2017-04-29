package com.hackerrank.www.introduction;

import java.util.Scanner;

public class StdinAndStdOut2 
{
	public static void main(String[] args) {
		// getting input from user
        Scanner scan = new Scanner(System.in);
        //reading the values
        int i = scan.nextInt();
        double d=scan.nextDouble();
        scan.nextLine();
        String s=scan.nextLine();
        //printing the values
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int   : " + i);
        scan.close();
    }

}

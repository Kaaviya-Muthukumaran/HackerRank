package com.hackerrank.www.strings;

import java.util.Scanner;

public class StringIntroduction 
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        // Sum of the length
        int i=A.length()+B.length();
        System.out.println(i);
        //If A is larger than B return yes otherwise return no
        if(A.codePointAt(0)>B.codePointAt(0))
        {
        	System.out.println("Yes");
        }
        else
        {
        	System.out.println("No");
        }
        // Printing only the first letter of both A and B in capital letter and combined it 
        String a=A.substring(0, 1).toUpperCase()+A.substring(1)+" "+B.substring(0, 1).toUpperCase()+B.substring(1);;
        System.out.println(a);
        sc.close();
    }

}

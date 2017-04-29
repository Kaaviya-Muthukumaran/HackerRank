package com.hackerrank.www.strings;

import java.util.Scanner;

public class SubString 
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        // prints the value in between start and end position
        String S1=S.substring(start, end);
        System.out.println(S1);
        
        in.close();
    }
     
}

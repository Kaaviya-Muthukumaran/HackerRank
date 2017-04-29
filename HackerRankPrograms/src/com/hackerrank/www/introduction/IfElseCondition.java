package com.hackerrank.www.introduction;

import java.util.Scanner;

public class IfElseCondition 
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();            
        String ans="";
        /* if condition is true prints the value otherwise checks for else if 
         * First else if condition is true prints it otherwise checks for second else if
         * if and else if conditions are false prints the statement in else condition
         */
        if(n%2==1)
        {
            ans = "Weird";
        }
        else if(n>=2&&n<=5)
        {
        	ans= "Not Weird";
        }
        else if(n>=6&&n<=20)
        {
        	ans= "Weird";
        }
        else{
        
            ans= "Not Weird" ;           
        }
        System.out.println(ans);
        sc.close();
    }
    

}

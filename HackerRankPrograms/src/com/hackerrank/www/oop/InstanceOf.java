package com.hackerrank.www.oop;

import java.util.ArrayList;
import java.util.Scanner;
// three different classes
class Student{}
class Rockstar{   }
class Hacker{}
public class InstanceOf 
{
    //count method taking array list object
	static String count(ArrayList mylist){
	      int a = 0,b = 0,c = 0;
	      for(int i = 0; i < mylist.size(); i++){
	         Object element=mylist.get(i);
	         /*checking whether element contains corresponding  values
	         if it contains increment by one*/
	         if(element instanceof Student) 
	            a++;
	         if(element instanceof Rockstar)
	            b++;
	         if(element instanceof Hacker)
	            c++;
	      }
	      String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
	      return ret;
	   }

	   public static void main(String []args){
	      ArrayList mylist = new ArrayList();
	      Scanner sc = new Scanner(System.in);
	      int t = sc.nextInt();
	      sc.close();
	      /*Checking whether it contains corresponding values 
	      if so add it to corresponding objects*/
	      for(int i=0; i<t; i++)
	      {
	         String s=sc.next();
	         if(s.equals("Student"))mylist.add(new Student());
	         if(s.equals("Rockstar"))mylist.add(new Rockstar());
	         if(s.equals("Hacker"))mylist.add(new Hacker());
	      }
	      System.out.println(count(mylist));
	   }

}

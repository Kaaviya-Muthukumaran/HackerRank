package com.hackerrank.www.oop;

import java.util.Scanner;
// superclass which is abstract class
abstract class Book
{
	String title;
	abstract void setTitle(String s);
	String getTitle()
	{
		return title;
	}
	
}
//subclass extending superclass 
class MyBook extends Book
{
    // overriding abstract method in superclass
	void setTitle(String s) 
	{
		title=s;
		
	}
	
}

public class AbstractClass 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		//creating object for subclass
		MyBook new_novel=new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
		sc.close();
	}
	

}

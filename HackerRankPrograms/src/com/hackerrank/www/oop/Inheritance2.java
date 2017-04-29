package com.hackerrank.www.oop;
// Subclass which inheriting Superclass
class Adder extends Arithmetic
{
	int add(int num1,int num2)
	{
		
		return num1+num2;
	}
	
}
// Superclass
class Arithmetic
{
	
}
// MainClass
public class Inheritance2 
{
	public static void main(String[] args) 
	{
		Adder a=new Adder();
		System.out.println("My superclass is: "+a.getClass().getSuperclass().getName());
		System.out.println(a.add(10,32)+ " " +a.add(10,3)+ " " +a.add(10,10)+ "\n");
	}

}

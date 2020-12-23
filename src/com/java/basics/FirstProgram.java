package com.java.basics;

public class FirstProgram {

	public static void main(String[] args) {
		int i=10;
		
		//Data types
		System.out.println("Printing value of integer i=" + i);
		double j=3.1423;
		System.out.println("Printing value of double j=" + j);
		boolean x=true;
		System.out.println("Printing Value of x="+x);
		char y='x';
		System.out.println("Printing Value of char y="+y);
		
		//Arithmetic operators
		
		double a=10;
		double b=20;
		System.out.println("Addition of a and b =" + (a+b));
		System.out.println("Division of a and b =" + (a/b));
		System.out.println("Multification of a and b =" + (a*b));
		System.out.println("%Percent of a and b =" + (a%b));
		String str="Hello world 2021";
		System.out.println("String =" + str);
		
		//Logical Operators
		System.out.println("Logical boolean Operators for Comparison of two boolean variables");
		boolean c=true;
		boolean d=false;	
		System.out.println(c&&d);
		System.out.println(c||d);
		System.out.println(!c);
		
		//Relational Operators >(gt),<(lt),>=,<=,==,!=
		System.out.println("Relational Operators AND-&&,OR-||,NOT-! for Comparison of two numeric variables");
		
		int g=10;
		int h=20;
		System.out.println(g>h);
		System.out.println(g>=h);
		System.out.println(g<h);
		System.out.println(g<=h);
		System.out.println(g==h);
		System.out.println(g!=h);
		
		//Assignment Operator =,+=.-+,*=,/=
		System.out.println("Assignment Operators =,+=,-=,*=,/=");
		
		int p=10;
		int q=100;
		p=q;
		
		p+=10; //110 p=p+10
		p-=11; //99  p=p-11
		p*=2; //198  p=p*2
		p/=2; //99   p=p/2
		
		System.out.println(p);
		
		//Increment Decrement operators
		System.out.println("Increment (++) and Decrement (--) Operators");
		int e=10;
		int f=20;
		e++;
		f--;
		System.out.println(e++);	//11	
		System.out.println(f--);	//19
		
		
	}

}

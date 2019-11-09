package com.basic;

import java.util.Scanner;

public class DemoClass2 extends DemoClass {
	

	public static void main(String[] args)
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int a=sc.nextInt();
		
		System.out.println("Enter First Number: ");
		int b=sc.nextInt();
		
		
		
		
		DemoClass2 obj=new DemoClass2();
		obj.multiply(a, b);
		obj.divide(a, b);
		obj.sum(a, b);
		obj.sub(a, b);
		
		
		
		// DemoClass d1obj=new DemoClass();
		// d1obj.sum(a, b);
		// d1obj.sub(a, b);
		
	}
		
		public void multiply(int a, int b)
		
		{
			
			int multy=a*b;
			System.out.println(multy);
			
			
		}


		public void divide(int a, int b)
		{
		
			int div=a/b;
			System.out.println(div);
			
			
		}

		
	}
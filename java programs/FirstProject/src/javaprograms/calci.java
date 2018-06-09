package javaprograms;

import java.util.Scanner;


public class calci {
	static int a;
	static int b;
	public static void main(String[] args) {
		System.out.println("Enter two numbers on which you want to perform operations:");
		Scanner sc = new Scanner(System.in);
		  a = sc.nextInt();
		  b = sc.nextInt();
		 calci cal = new calci();
		 cal.add();
		 cal.sub();
		 cal.mult();
		 cal.div();
	}
	public void add()
	{
	int c = a+b;	
	System.out.println("Addition is:" +c);
	}
	
	public void sub()
	{
	int c = a-b;	
	System.out.println("Subtraction is:" +c);
	}
		
	public void mult()
	{
	int c = a*b;	
	System.out.println("Multiplication is:" +c);
	}
	
	public void div()
	{
	double c = a/b;	
	System.out.println("Divition is:" +c);
	}
}

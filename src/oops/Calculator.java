package oops;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");	
		int b=sc.nextInt();
		System.out.println("enter your choice");
		char c=sc.next().charAt(0);
	
		switch(c)
		{
		
		case '+':System.out.println(a+b);
		break;
		case '-':System.out.println(a-b);
		break;
		case '*':System.out.println(a*b);
		break;
		case '/':
		if(b==0)
		{
			System.out.println("error");
		}
		else
		{
			System.out.println(a/b);
			break;
		}
		default:System.out.println("Invalid");
		
		}
			

	}

}

package oops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b=0,n,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		 n=sc.nextInt();
		c=n;
		while(n>0)
		{
			a=n%10;
			b=b*10+a;
			n=n/10;
			
		}
		if(c==b)
		{
		System.out.println("It is a palindrome  number");
		}
		else
		{
		System.out.println("Not a palindrome  number");	

	    }

				
	}

}

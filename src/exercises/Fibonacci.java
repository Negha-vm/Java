package exercises;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0,c=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit");
		int n=sc.nextInt();
	
		for(int i=1;i<=n;i++)
		{
			
			a=b;
			b=c;
			c=a+b;
			System.out.print(" "+a+" ");
		}
		
	}

}

package exercises;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int a,b,c=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 3 digit number");
	    a=sc.nextInt();
		b=a;
		while(a!=0)
		{
			n=a%10;
			a=a/10;
			c=c+(n*n*n);						
		}
		if(c==b)
		{
			System.out.println("It is a armstrong number");
		}
		else
		{
			System.out.println("Not a armstrong number");
		}
	}
}

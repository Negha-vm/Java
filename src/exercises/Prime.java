package exercises;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();					
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count++;							
			}
		}				
		if(count>1)
		{
			System.out.println("Not a Prime number");
		}
		else
		{
			System.out.println("It is a Prime number");
		}			
	}

}

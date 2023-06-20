package methods;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		int n=sc.nextInt();
		Sum s=new Sum();
		int sum=s.sum(n);
		System.out.println("Sum="+sum);
		
	}
	public int sum(int n)
	{
		int r,s=0;
		while(n>0)
		{
			r=n%10;
			s=s+r;
			n=n/10;
		}
		return s;
	}
	
	

}

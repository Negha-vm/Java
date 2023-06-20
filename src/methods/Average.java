package methods;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		Average avg=new Average();
		avg.average(a, b,c);
		
		
	}
	public void average(int a,int b,int c)
	{
		int s=a+b+c;
		int r=s/3;
		System.out.println("Average="+r);

	}

}

	



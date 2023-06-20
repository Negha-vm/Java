package exercises;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		double sum=0,avg=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
	    
	    for(int i=1;i<=10;i++)
	    {
	    	int n=sc.nextInt();
	    	sum=sum+n;
	    	avg=sum/10;
	    }
	    System.out.println("Average : "+avg);
	}

}

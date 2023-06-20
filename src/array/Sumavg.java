package array;

import java.util.Scanner;

public class Sumavg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,avg=0;
		int[] ar=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		for(int i=0;i<10;i++)
		{
	    ar[i]=sc.nextInt();
		    
	    }
		for(int v:ar)
		{
			sum=sum+v;
		    avg=sum/10;
		}
			System.out.println("sum:"+sum);
			System.out.println("average:"+avg);
						
	}

}

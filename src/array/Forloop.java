package array;

import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar=new int[3];
		ar[0]=34;
	    ar[1]=20;
		ar[2]=10;
		for(int i=0;i<3;i++)
		{
			System.out.println(ar[i]);
		}
		
		
		//using scanner
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		for(int i=0;i<3;i++)
		{
	    ar[i]=sc.nextInt();
		}
		
		System.out.println("entered numbers");

		for(int i=0;i<3;i++)
		{
			System.out.println(ar[i]);
		}
	}

}

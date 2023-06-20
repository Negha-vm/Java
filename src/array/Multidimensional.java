package array;

import java.util.Scanner;

public class Multidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[3][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
			    a[i][j]=sc.nextInt();

			}

			
	    }
		System.out.println("entered numbers");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
					    
	    }
//		for(int b[]:a)
//		{
//			for(int c:b)
//			{
//				System.out.println(c);
//			}
//		}
	}

}

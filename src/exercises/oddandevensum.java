package exercises;
import java.util.Scanner;
public class oddandevensum {
	public static void main(String[] args) {	
		int n=0,odd=0,even=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit");
		int l=sc.nextInt();
		System.out.println("enter number");
		for(int i=1;i<=l;i++)
		{
		n=sc.nextInt();
			
			if(n%2==0)
			{				
				even=even+n;								
			}
			else
			{
				odd=odd+n;				
			}
		}
		System.out.println("sum of odd numbers="+odd);
		System.out.println("sum of even numbers="+even);
	}
}

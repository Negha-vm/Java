package exercises;
import java.util.Scanner;
public class Count {
	public static void main(String[] args) {		
		int positive=0,negative=0,zero=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit");
		int n=sc.nextInt();
		System.out.println("enter the numbers");				
		for(int i=1;i<=n;i++)
		{
			int n1=sc.nextInt();
			if(n1<0)
			{
				negative++;
			}
			else if(n1>0)
			{
				positive++;
			}
			else
			{
				zero++;
			}					
		}
		System.out.println("count of positive nos:"+ positive);
		System.out.println("count of negative nos:"+ negative);
		System.out.println("count of zeros:" +zero);
	}
}

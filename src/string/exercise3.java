package string;

import java.util.Scanner;

public class exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
	    String s=sc.nextLine();
	    for(int i=0;i<s.length();i++)
	    {
	    	char c=s.charAt(i);
	    	if(c=='a'|| c=='e' ||c=='i'|| c=='o' || c=='u')
	    	{
	    		count++;
	    	}
	    }
	    	System.out.println(count);
	    }
	

}

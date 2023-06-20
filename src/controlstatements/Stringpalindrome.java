package controlstatements;

import java.util.Scanner;

public class Stringpalindrome {
		
	public static void main(String[] args) {
        String s2="";
        Scanner sc=new Scanner(System.in);
    	System.out.println("enter a string");
    	String s1=sc.next();
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		
		if(s1.equals(s2))
		{
		System.out.println("It is a palindrome string");
		}
		else
		{
		System.out.println("Not a palindrome string");	

	    }

				

	}

}

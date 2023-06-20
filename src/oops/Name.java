package oops;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		//String a=sc.next();
		//String a=sc.nextLine();//to include space
		char a=sc.next().charAt(1);//to display character with position
		System.out.println("My name is:" + a);
	}

}

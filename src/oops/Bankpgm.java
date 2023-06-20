package oops;

import java.util.Scanner;

interface Bank
{
	public void showdetails();
	public void withdrawal();
	public void deposit();
	public void balance();
}
class SBI implements Bank
{
    static String bankname="SBI";
    String details="Ernakulam";
    String name="Negha";
    int balance=50000;
    long accountno;
    Scanner sc=new Scanner(System.in);
	@Override
	public void showdetails() {
		
		System.out.println("Customername:"+name);
		System.out.println("Bank details:"+details);
		System.out.println("enter account no");
	    accountno=sc.nextLong();
		System.out.println("Balance="+balance);
				
	}
	@Override
	public void withdrawal() {
		
		System.out.println("enter withdrawal amount");
		int withdraw=sc.nextInt();
		balance=balance-withdraw;		
	}
	@Override
	public void deposit() {
		System.out.println("enter deposit amount");
		int deposit=sc.nextInt();
		balance=balance+deposit;		
	}
	@Override
	public void balance() {
		System.out.println("Balance="+balance);		
	}	
}
public class Bankpgm {
	public static void main(String[] args) {
		SBI ob=new SBI();
		ob.showdetails();
		ob.withdrawal();
		ob.deposit();
		ob.balance();
	}
}

package oops;

interface Bank2
{
	
	public void deposit();
	public void withdrawal();
	public void balance();
}
interface creditcarddetail
{
	public void creditcarddetails();
}
class AxisBank implements Bank2,creditcarddetail
{
	

	@Override
	public void deposit() {
		System.out.println("depositdetails");
		
	}

	@Override
	public void withdrawal() {
		
		System.out.println("withdrawdetails");
	}

	@Override
	public void balance() {
		System.out.println("balancedetails");
		
	}
	@Override
	public void creditcarddetails() {
		System.out.println("creditcarddetails");
		
	}

}
class Federal implements Bank2
{

	@Override
	public void deposit() {
		
		System.out.println("deposit");
	}

	@Override
	public void withdrawal() {
		
		System.out.println("withdraw");
	}

	@Override
	public void balance() {
	
		System.out.println("balance");
	}
	
}

public class Interfacepgm1 {

	public static void main(String[] args) {
		Bank2 ob=new AxisBank();
		ob.deposit();
		ob.withdrawal();
		ob.balance();
		
		ob=new Federal();
		ob.deposit();
		ob.withdrawal();
		ob.balance();
		
		creditcarddetail ob1=new AxisBank();
		ob1.creditcarddetails();
		

	}
}

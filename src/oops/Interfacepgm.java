package oops;

interface Bank1
{
	
	public void deposit();
	public void withdrawal();
	public void balance();
}
interface creditcard
{
	public void creditcarddetails();
}
class HDFC implements Bank1,creditcard
{
	

	@Override
	public void deposit() {
		System.out.println("HDFCdeposit");
		
	}

	@Override
	public void withdrawal() {
		
		System.out.println("HDFCwithdraw");
	}

	@Override
	public void balance() {
		System.out.println("HDFCbalance");
		
	}
	@Override
	public void creditcarddetails() {
		System.out.println("creditcarddetails");
		
	}

}
class ICICI implements Bank1
{

	@Override
	public void deposit() {
		
		System.out.println("ICICIdeposit");
	}

	@Override
	public void withdrawal() {
		
		System.out.println("ICICIwithdraw");
	}

	@Override
	public void balance() {
	
		System.out.println("ICICIbalance");
	}
	
}

public class Interfacepgm {

	public static void main(String[] args) {
		HDFC ob=new HDFC();
		ob.deposit();
		ob.withdrawal();
		ob.balance();
		ob.creditcarddetails();
		ICICI ob1=new ICICI();
		ob1.deposit();
		ob1.withdrawal();
		ob1.balance();

	}
}


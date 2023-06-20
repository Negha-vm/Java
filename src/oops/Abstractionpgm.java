package oops;
abstract class car
{
	abstract public void speedlimit();
	public void speed()
	{
		System.out.println("carspeed");
	}
}		

class Maruti extends car
{

	@Override
	public void speedlimit() {
		System.out.println("marutispeed");
		
	}
	
	
}
class BMW extends car
{

	@Override
	public void speedlimit() {
		System.out.println("bmwspeed");

		
	}
	
}

public class Abstractionpgm {

	public static void main(String[] args) {
		Maruti ob=new Maruti();
		ob.speedlimit();
		ob.speed();
		BMW ob1=new BMW();
		ob1.speedlimit();

	}

}

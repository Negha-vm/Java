package oops;

class Car1
{
	public void Accelerator()
	{
		System.out.println("Accelerator");
	}
}


class Duster extends Car1
{

	@Override
	public void Accelerator()
	{
		System.out.println("Duster");
		super.Accelerator();
	}
	
}
public class Methodoverriding {

	public static void main(String[] args) {
		
		Duster ob=new Duster();
		ob.Accelerator();
	}
}

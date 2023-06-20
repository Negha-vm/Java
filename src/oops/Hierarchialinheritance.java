package oops;
class Animal1
{
	public void Animaldetails()
	{
		System.out.println("Animaldetails");
	}
}
class Lion extends Animal1
{
	public void Liondetails()
	{
		System.out.println("Liondetails");
	}
	
}
class Tiger extends Animal1
{
	public void Tigerdetails()
	{
		System.out.println("Tigerdetails");
	}
	
}



public class Hierarchialinheritance {
	
public static void main(String[] args) {
	 Lion obj=new Lion();
	 obj.Animaldetails();
	 obj.Liondetails();
	 Tiger ob=new Tiger();
	 ob.Animaldetails();
	 ob.Tigerdetails();

}


	

}

package oops;
class Animals
{
	public void Animalfood()
	{
		System.out.println("Animalfood");
	}
}
class Dog1 extends Animals
{
	public void Breed()
	{
		System.out.println("Pug");
	}
	
}
class BabyDog extends Dog1
{
	public void Color()
	{
		System.out.println("White");
	}
	
}

public class Multilevelinheritance {

	public static void main(String[] args) {
	 Dog obj=new Dog();
	 obj.Animalfood();
	 obj.Breed();
	 BabyDog ob=new BabyDog();
	 ob.Animalfood();
	 ob.Breed();
	 ob.Color();



	
	}

}

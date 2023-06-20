package oops;

class Animal
{
	public void Animalfood()
	{
		System.out.println("Animalfood");
	}
}
class Dog extends Animal
{
	public void Breed()
	{
		System.out.println("Pug");
	}
	
}


public class Singlelevelinheritance {

	public static void main(String[] args) {
	 Dog obj=new Dog();
	 obj.Animalfood();
	 obj.Breed();
	 

	}

}

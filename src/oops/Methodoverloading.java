package oops;

public class Methodoverloading {

	public static void main(String[] args) {
		Methodoverloading ob=new Methodoverloading();
		ob.add();
		ob.add(30, 80);
		ob.add(20, 2.0);
		ob.add(34.5, 50);
	}
public void add()
{
	int a=10, b=10,c;
	c=a+b;
	System.out.println(c);
	
}
public void add(int a,int b)
{
	int c=a+b;
	System.out.println(c);
}
public void add(int a,double b)
{
	double c=a+b;
	System.out.println(c);
}
public void add(double a,int b)
{
	double c=a+b;
	System.out.println(c);
}
}

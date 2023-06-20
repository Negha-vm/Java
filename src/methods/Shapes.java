package methods;

public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes sh=new Shapes();
		sh.triangle();
		sh.rect();
		sh.circle(3);
		sh.square(4);
	}
	public void triangle()
	{
		double b=4,h=2;
		double c=0.5*b*h;
		System.out.println("Area of triangle="+c);
	}
	public int rect()
	{
		int l=6,b=2;
		int c=l*b;
		System.out.println("Area of rectangle="+c);
		return c;
	}
	public double circle(double r)
	{
		
		double c=3.14*r*r;
		System.out.println("Area of circle="+c);
		return c;
	}
	public void square(int a)
	{
		
		int c=a*a;
		System.out.println("Area of square="+c);
	}
}

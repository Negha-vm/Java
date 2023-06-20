package oops;


public class Accessmodifier {

	private int a=10;
	int b=20;//default access modifier
	protected int c=30;
	public int d=30;
	public static void main(String[] args) {
		
		Accessmodifier ob=new Accessmodifier();
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.c);
		System.out.println(ob.d);
	}

}

package oops;

public class Exceptionpgm {

	public static void main(String[] args) {
		
		try {
			int a=20,b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Arithmetic expression");
		}
		System.out.println("hello");

	
	
	try {
		int [] a=new int[2];
		a[0]=10;
		a[1]=20;
		System.out.println(a[2]);
		
	}
	catch(Exception e)
	{
		
		System.out.println("Arrayindexoutofboundexception");
	}	

	
	
	try {
		String s=null;
		System.out.println(s.length());
	}
	catch(Exception e)
	{
	System.out.println("Nullpointerexception");
	}
  }

}

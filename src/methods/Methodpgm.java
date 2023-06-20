package methods;

public class Methodpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodpgm ob=new Methodpgm();
		ob.add();
		ob.sub();
		//System.out.println("sub"+c);
		ob.mul(2, 5);
		ob.div(6, 25);
	}
	//method without return type and without parameter
		public void add()
		{
			int a=10,b=2;
			int c=a+b;
			System.out.println(c);
		}
	//method with return type and without parameter
		public int sub()
		{
			int a=4,b=5;
			int c=a-b;
			System.out.println(c);
			return c;
		}
	//method with return type and with parameter
		public int mul(int a,int b)
		{
			int c=a*b;
			System.out.println(c);
			return c;
		}
	//method without return type and with parameter
		public void div(double a,double b)
		{
			
			double c=a/b;
			System.out.println(c);
			
		}
				


}

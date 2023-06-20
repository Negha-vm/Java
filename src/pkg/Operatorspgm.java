package pkg;

public class Operatorspgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10,b=10;
System.out.println("a+b="+(a+b));
System.out.println("a-b="+(a-b));
System.out.println("a*b="+(a*b));
System.out.println("a/b="+(a/b));
int c=20,d=30;
System.out.println("c+=d="+(c+=d));
System.out.println("c-=d="+(c-=d));
System.out.println("c*=d="+(c*=d));

System.out.println((c>d));
System.out.println((c<d));
System.out.println((c==d));

String username="abc";
String password="123";
System.out.println(username=="abc" && password=="123");
System.out.println(username=="abcd" && password=="123");
System.out.println(username=="abc" || password=="1234");
System.out.println(!(username=="abc"));

int e=2;
System.out.println(e++);
System.out.println(e);
System.out.println(e--);
System.out.println(e);
System.out.println(++e);
System.out.println(e);
System.out.println(--e);
System.out.println(e);



	}

}

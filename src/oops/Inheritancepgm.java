package oops;
class Member
{
	String name;
	int age;
	int salary;
	String Address;
	String phoneno;
	
	public void printdetails() {
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("Phoneno="+phoneno);
		System.out.println("salary="+salary);
		System.out.println("Address="+Address);
	}
}
class Employee1 extends Member
{
	
	String specialisation;
	
	
}
class Manager extends Member
{
	String department;
		
}

public class Inheritancepgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee1 emp=new Employee1();
emp.name="Achu";
emp.age=22;
emp.Address="kochi";
emp.phoneno="8976654456";
emp.salary=30000;
System.out.println(emp.specialisation="Developer");
emp.printdetails();
Manager m=new Manager();
m.name="d";
m.age=32;
m.Address="Kochi";
m.phoneno="9087888888";
m.salary=50000;
System.out.println(m.department="HR");
m.printdetails();
	}

}

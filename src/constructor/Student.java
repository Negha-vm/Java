package constructor;

//default constructor

public class Student {

	int studentid;
	String studentname;
   

public Student()
{
	studentid=100;
	studentname="Negha";
}


	public static void main(String[] args) {
	 Student s=new Student();
	 System.out.println(s.studentid);
	 System.out.println(s.studentname);
   
     
	}

}




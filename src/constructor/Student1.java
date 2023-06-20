package constructor;

//Parameterised constructor

public class Student1 {
	int studentid;
	String studentname;
	//String college="cusat";
	
public Student1(int studentid,String studentname)
{
	this.studentid=studentid;
	this.studentname=studentname;
}
public void display()
{
	 System.out.println(studentid);
	 System.out.println(studentname);
}
  
    public static void main(String[] args) {
    Student1 s=new Student1(100,"Negha");
    s.display();
	}
}


	

		

	
	
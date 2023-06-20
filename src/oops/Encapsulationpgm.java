package oops;
class Emp
{
	private String name;
	private String designation;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}
public class Encapsulationpgm {

	public static void main(String[] args) {
	Emp ob=new Emp();
	ob.setName("Negha");
	ob.setDesignation("Tester");
	System.out.println(ob.getName());
	System.out.println(ob.getDesignation());

	}

}

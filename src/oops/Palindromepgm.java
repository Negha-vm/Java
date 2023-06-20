package oops;



public class Palindromepgm {

	public static void main(String[] args) {
		
		String s="Malayalam",s2="";
		
		for(int i=s.length()-1;i>=0;i--) {
			s2=s2+s.charAt(i);
		}
		
		
		if(s.equalsIgnoreCase(s2))
		{
		System.out.println("It is a palindrome string");
		}
		else
		{
		System.out.println("Not a palindrome string");	

	    }

				
	}
	

}

package string;

public class exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="selenium webdriver is used for webapplication testing";
		String[] ar=s.split(" ");
		for(String a:ar) 
		{
			System.out.println(a);
		
			if(a.contains("webapplication"))
			{
			
			break;
			}
		}
		
	}

}

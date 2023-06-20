package string;

public class stringoperations {

	public static void main(String[] args) {
//concatenation
String s="hello";
String s1="welcome";
String s2="Hello";
String s3="Hello how are you";
String s4="    Hiii";
System.out.println(s.concat(s1));
System.out.println(s+" "+s1);
System.out.println(1+2+s+4+5);

//equals
System.out.println(s.equals(s1));
System.out.println(s.equals(s2));
System.out.println(s.equalsIgnoreCase(s2));

//contains
System.out.println(s3.contains("how"));

//toUppercase & toLowercase
System.out.println(s.toUpperCase());
System.out.println(s2.toLowerCase());

//trim
System.out.println(s4.trim());

//length
System.out.println(s.length());

//startsWith
System.out.println(s3.startsWith("Hello"));

//endsWith
System.out.println(s3.endsWith("you"));

//substring
System.out.println(s3.substring(1,6));

//charAt
System.out.println(s.charAt(1));

//split
String[] ar=s3.split(" ");
for(String a:ar) 
{
System.out.println(a);
	
}
	}
}

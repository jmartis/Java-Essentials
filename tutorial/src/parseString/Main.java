package parseString;

public class Main {

	public static void main(String[] args) {
		
		String s1 = "Welcome to my home";
		
		System.out.println("The length of string: " + s1.length());
		
		int pos = s1.indexOf("to");
		System.out.println("Position of to: " + pos);
		
		String sub = s1.substring(11);
		System.out.println(sub);
		
		String s2 = "Welcome       ";
		int leng1 = s2.length();
		System.out.println(leng1);
		String s3 = s2.trim();
		System.out.println(s3.length());
	}

}

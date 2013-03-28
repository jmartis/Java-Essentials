package Exceptions;

public class Main {


	public static void main(String[] args) {
		
		String [] strings = {"Welcome"};
		
		try {
			System.out.println(strings[1]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			//e.printStackTrace();
			System.out.println("There was and error");
		}
		System.out.println("The application is still running");

	}

}

package Methods;

public class Main {
	
	public static void main(String [] args){
	
		double result = addTwoValues();
		int numbers = twoNumber("3", "4");
		double restOfMultiple = addMultipleNumbers(1,2,3);
		
		System.out.println("The answer of the first method is: " + result);
		System.out.println("The answer of the second method is: " + numbers);
		System.out.println("The answer of the third method is: " + restOfMultiple);
		
	}

	private static double addTwoValues() {
		int number1 = 5;
		int number2  = 5;
		
		double result = number1 + number2;
		return result;
	}
	
	private static int twoNumber(String s1, String s2){

		int value1 = Integer.parseInt(s1);
		int value2 = Integer.parseInt(s2);
	
		return value1 + value2;
		
	}
	
	private static double addMultipleNumbers(double ... values){
		double result = 0;
		for (double d : values) {
			result += d;
		}
		return result;
	}

}

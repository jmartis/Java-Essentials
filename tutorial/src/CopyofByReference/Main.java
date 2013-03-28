package CopyofByReference;

public class Main {
	
	public static void main(String [] args){
		
		int original = 10;
		
		System.out.println("Original before: " + original);
		incrementValue(original);
		System.out.println("Original after: " + original);
		
		int [] arOriginal = {10,20,30};
		System.out.println("Original before: " + arOriginal[0]);
		incrementValue(arOriginal);
		System.out.println("Original after: " + arOriginal[0]);
		
		
		String originalString = "Original!";
		System.out.println("Original before: " + originalString);
		changeString(originalString);
		System.out.println("Original after: " + originalString);
		
	}
	
	static void incrementValue(int inFunction){
		inFunction++;
		System.out.println("In function: " + inFunction);
		
	}
	
	static void incrementValue(int[] inFunction){
		inFunction[0]++;
		System.out.println("In function: " + inFunction[0]);
		
	}
	
	static void changeString (String inFunction){
		inFunction = " New!";
		System.out.println("In function:" + inFunction );
	}

}

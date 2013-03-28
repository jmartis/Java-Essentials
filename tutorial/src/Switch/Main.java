package Switch;

public class Main {
	
	public enum month{
		JANUARY, FEBRUARI, MARCH;
	}
	
	
	public static void main(String[] args){
		
		int number = 1; // with integer
		month m = month.JANUARY; //with enums
		
		
		switch(m){
		
		case JANUARY: 
			System.out.println("First month");
			break;
		
		case FEBRUARI: 
			System.out.println("Second month");
			break;
		
		case MARCH: 
			System.out.println("Third month");
			break;
		default:
			System.out.println("Default action when no-case ");
			break;
		}
		
	}
	
	

}

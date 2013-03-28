package String;

public class Main {
	
	public static void main(String [] args){
		String s1 = "Welcome to my application";
		String s2 = new String("Welcome to my application!");
		
		System.out.println(s2);
		
		if(s1.equals(s2)){
			System.out.println("match");
		}
		else{
			System.out.println("no match");
		}
		
		
		char [] chars = s1.toCharArray();
		for (char c : chars) {
			System.out.println(c);
			
		}
	}
	

}

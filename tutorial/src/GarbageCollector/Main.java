package GarbageCollector;

public class Main {
	
	
	public static void main(String [] args){
		
		String expireMe = "expire";
		System.out.println(expireMe);
		
		expireMe = null;
		System.gc();
	
		
		System.out.println(expireMe);
		
		
	

}
	
}

package test.schermen;

import test.menuKnoppen.NieuwspelKnop;
public class schermController {
	
	private static boolean onOff = true;
	NieuwspelKnop n;
	
	
	public static boolean isRunning(){
		
		
		return onOff;
	}
	
	public static void runningStatus(){
		
		boolean isRunning = false;
		
		onOff = isRunning;
		
	}
	

}
